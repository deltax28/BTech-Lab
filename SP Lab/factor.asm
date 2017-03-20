.model small
.stack 256

.data
msg1 db "Enter number : $"
msg2 db 0ah,0dh,"Factorial = $"

.code

start:
	mov ax,@data ;load ds reg
	mov ds,ax
	
	lea dx,msg1 ;show enter a number
	mov ah,09h
	int 21h
	
	mov ah,01h ;read char
	int 21h
	
	sub al,30h ;convert to decimal
	
	mov ch,00h
	mov cl,al ;load count
	
	mov bl,al;
	mov dx,0001h
	
	lp:
	mov al,dl
	mul cl
	mov dx,ax
	dec bl
	loop lp
	
	
	mov bl,dl
	mov bh,dl
	
	lea dx,msg2 ;show fact
	mov ah,09h
	int 21h
	
	and bl,0fh
	and bh,11110000b
	
	mov cl,04h
	shr bh, cl
	
	mov dl,bh
	add dl,30h	
	mov ah,02h
	int 21h
	
	mov dl,bl
	add dl,30h	
	mov ah,02h
	int 21h
	
	mov ax,4c00h
	int 21h
	
end start