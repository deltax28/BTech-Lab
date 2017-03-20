.model small
.stack 256

.data
msg1 db "Enter 1st number : $"
msg2 db 0ah,0dh,"Enter 2nd number : $"
msg3 db 0ah,0dh,"Largest is : $"
msg4 db 0ah,0dh,"Smallest is : $"

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

	cmp al,bl
	
	jc second
	mov cl,al
	mov ch,bl
	jmp result

second:	mov cl,bl
	mov ch,al

result:		
	lea dx,msg3
	mov ah,09h	
	int 21h

	mov dl,cl
	mov ah,02h
	int 21h

	lea dx,msg4
	mov ah,09h	
	int 21h

	mov dl,ch
	mov ah,02h
	int 21h

	mov ax,4c00h
	int 21h

end start