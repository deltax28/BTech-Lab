.model small
.stack  256

.data
 msg1 db "aaaaaccccaacccccccddddd $"
 msg2 db 0ah,0dh,"no:of occurance of a :$"
 
 .code
 
 start :
	mov ax,@data
	mov ds,ax
	
	lea dx,msg1
	mov ah,09h
	int 21h
	
	lea si,msg1
	mov cl,00h
	
	lp:
		mov al,[si]
		cmp al,61h
		jne nteql
		inc cl
	  nteql:
		inc si
		mov bl,[si]
		cmp bl,24h
		jz finish
		jmp lp
	
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
		
		