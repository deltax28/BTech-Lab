.model small
.stack  256

.data
 msg1 db "aaaarew$"
 msg2 db 0ah,0dh,"No of appearances of a :$"
 
 .code
 
 start :
	mov ax,@data
	mov ds,ax
	
	lea dx,msg1
	mov ah,09h
	int 21h
	
	lea si,msg1
	mov cl,00h
	
	giri:
		mov al,[si]
		cmp al,61h
		jne noa
		inc cl
	  noa:
		inc si
		mov bl,[si]
		cmp bl,24h
		jz finish
		jmp giri
	
	finish:
		lea dx,msg2
		mov ah,09h
		int 21h
		
		mov dl,cl
		add dl,30h
		mov ah,02h
		int 21h
	
		mov ah,4ch
		int 21h
	
 end start
		
		