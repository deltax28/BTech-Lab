.model small
.stack 256

.data
msg1 db "Enter a number : $"
msg2 db 0ah,0dh,"The entered number is not a prime. $"
msg3 db 0ah,0dh,"The entered number is prime. $"
msg4 db 0ah,0dh,"1 is neither prime nor composite. $"

.code
start:
	mov ax,@data ;load ds reg
	mov ds,ax
	
	lea dx,msg1 ;show enter a string
	mov ah,09h
	int 21h
	
	mov ah,01h
	int 21h
	
	mov bl,al
	sub bl,30h ;inputed number
	
	cmp bl,01h
	jz neithprime
	
	cmp bl,02h
	jz prime
	
	mov al,bl ;perform n/2
	mov ah,00h
	mov bh,02h
	
	div bh	
	mov bh,al ; n/2 in bh, n in bl
	
	mov ch,00h
	mov cl,bh
	
	mov dh,02h ; var to incr
	
	lp1:
	
	mov ah,00h
	mov al,bl
	
	div dh
	
	cmp ah,00h
	jz notprime
	
	inc dh
	loop lp1
	
	prime:
	lea dx,msg3 ;prime
	mov ah,09h
	int 21h
	jmp exit
	
	notprime:
	
	lea dx,msg2 ;not prime
	mov ah,09h
	int 21h
	jmp exit
	
	neithprime:
	lea dx,msg4 ;neither prime nor
	mov ah,09h
	int 21h
	
	exit:	
	mov ax,4c00h
	int 21h
end start