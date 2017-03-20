.model small
.stack 256

.data
msg1 db "Enter 1st number : $"
msg2 db 0ah,0dh,"Enter 2nd number : $"
msg3 db 0ah,0dh,"Quotient is : $"
msg4 db 0ah,0dh,"Remainder is: $"

.code

start:

	mov ax,@data
	mov ds,ax
	
	lea dx,msg1
	mov ah,09h
	int 21h
	
	mov ah,01h
	int 21h
	
	mov bl,al
	
	lea dx,msg2
	mov ah,09h	
	int 21h
	
	mov ah,01h
	int 21h
	
	sub bl,30h
	sub al,30h	
	
	mov cl,al
	mov al,bl
	mov bl,cl
	mov  ah,00h
	
	div bl
	
	;aad
	add ax,3030h
	mov cx,ax
	
	lea dx,msg3
	mov ah,09h
	int 21h
	
	mov ah,02h
	mov dl,cl
	int 21h
	
	lea dx,msg4
	mov ah,09h
	int 21h
	
	mov ah,02h
	mov dl,ch
	int 21h
	
	mov ax,4c00h
	int 21h
	
end start