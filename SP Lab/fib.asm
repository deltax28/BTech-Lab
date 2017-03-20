.model small
.stack 256

.data
msg1 db "Enter limit : $"
comma db ", $"
msg2 db 0ah,0dh,"Fibonacci series : $"

.code

start:
	mov ax,@data ;load ds reg
	mov ds,ax

	lea dx,msg1 ;show enter limit
	mov ah,09h
	int 21h

	mov ah,01h ;read limit
	int 21h

	mov ch,00h ;lord count to cx
	mov cl,al
	sub cx,0030h ;make count integer from ascii
	
	lea dx,msg2 ;show fib ser
	mov ah,09h
	int 21h
	
	cmp cl,00h ;check for limit 0 condition
	jz exit
	
	mov bx,0001h ;load 1st and 2nd fib
	
	mov dl,bh ;show 1st no
	add dl,30h	
	mov ah,02h
	int 21h
	
	cmp cl,01h ;check for limit 1 condition
	jz exit
	
	lea dx,comma ;display comma
	mov ah,09h
	int 21h
	
	mov dl,bl ;show 2nd no
	add dl,30h	
	mov ah,02h
	int 21h
	
	cmp cl,02h ;check for limit 2 condition
	jz exit
	
	sub cl,02h
	lp:
	
	lea dx,comma ;display comma
	mov ah,09h
	int 21h
	
	mov dl,bh
	add dl,bl
	mov bh,bl
	mov bl,dl
	add dl,30h ;convert to ascii
	
	mov ah,02h ;display
	int 21h
	
	loop lp
	
	exit:	
	mov ax,4c00h
	int 21h

end start

