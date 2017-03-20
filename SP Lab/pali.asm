.model small
.stack 256

.data
msg1 db "Enter a string : $"
msg2 db 0ah,0dh,"The entered string is not a palindrome. $"
msg3 db 0ah,0dh,"The entered string is palindrome. $"
str1 db 30 dup()

.code

start:
	mov ax,@data ;load ds reg
	mov ds,ax
	
	lea dx,msg1 ;show enter a string
	mov ah,09h
	int 21h
	
	; read a string
	lea si,str1	
	rp:
	mov ah,01h ;read a char
	int 21h	
	cmp al,0dh ;conpare with new line char
	jz finish
	mov [si],al ; move read char to string and incremt counts
	inc si	
	jmp rp
	finish:
	mov al,24h
	mov [si],al ;$ char
	;finished reading string
	
	dec si
	lea di,str1
	
	lp:	
	mov al,[si]
	mov ah,[di]
	cmp al,ah
	jnz notpali
	dec si
	inc di
	loop lp
	
	lea dx,msg3
	mov ah,09h
	int 21h
	jmp exit
	
	notpali:
	lea dx,msg2
	mov ah,09h
	int 21h
	
	exit:	
	mov ax,4c00h
	int 21h
end start