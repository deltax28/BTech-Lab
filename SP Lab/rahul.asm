.model small
.stack 256
.data
q db 0ah,0dh,"Enter string:$"
w db 0ah,0dh,"No.of lower case are:$"  
.code
start:
mov ax,@data
mov ds,ax
lea dx,q
mov ah,09h
int 21h

mov cl,00h
read:
mov ah,01h
int 21h
cmp al,0dh
jz finish
cmp al,7ah
jnc read
cmp al,61h
jc read
inc cl
jmp read

finish:
lea dx,w
mov ah,09h
int 21h

add cl,30h
mov dl,cl
mov ah,02h
int 21h


mov ah,4ch
int 21h

end






