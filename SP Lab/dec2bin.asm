.model small
.stack 256

.data
msg1 db "Enter a decimal number : $"
msg2 db 0ah,0dh,"Binary equivalent is :$"
str1 db 30 dup()

.code
start:
	mov ax,@data ;load ds reg
	mov ds,ax
	
	lea dx,msg1 ;show enter a string
	mov ah,09h
	int 21h
	
	mov ah,01h ;read a number
	int 21h
	
	mov bl,al
	sub bl,30h ;inputed number
	
	mov bh,02h
	lea si,str1
	
	mov al,bl
	mov cx,0000h
	
	lp:	
	mov ah,00h
	div bh
	mov [si],ah
	inc si
	inc cl
	cmp al,00h
	jz fin
	jmp lp
	
	fin:
	
	lea dx,msg2
	mov ah,09h
	int 21h
	
	dec si
	
	lp1:
	mov dl,[si]
	add dl,30h
	mov ah,02h
	int 21h
	dec si
	loop lp1
	
	exit:
	mov ax,4c00h
	int 21h
end start
