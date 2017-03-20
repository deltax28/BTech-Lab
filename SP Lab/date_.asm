.MODEL SMALL
 .STACK 100H

 .DATA
   PROMPT  DB  'Current Date is : $'     
   DATE    DB  '00:00:00$'        ; date format dd-mm-yy

 .CODE
   MAIN PROC
     MOV AX, @DATA                ; initialize DS
     MOV DS, AX

     LEA BX, DATE                 ; BX=offset address of string DATE

     CALL GET_DATE                ; call the procedure GET_DATE

     LEA DX, PROMPT               ; DX=offset address of string PROMPT
     MOV AH, 09H                  ; print the string PROMPT
     INT 21H                      

     LEA DX, DATE                 ; DX=offset address of string DATE
     MOV AH, 09H                  ; print the string DATE
     INT 21H                      

     MOV AH, 4CH                  ; return control to DOS
     INT 21H
   MAIN ENDP
   GET_DATE PROC
    ; this procedure will get the current system date 
    ; input : BX=offset address of the string DATE
    ; output : BX=current date

    PUSH AX                       ; PUSH AX onto the STACK
    PUSH CX                       ; PUSH CX onto the STACK 

    MOV AH, 2AH                   ; get the current system date
    INT 21H                       

    MOV AL, DL                    ; set AL=DL , DL=day
    CALL CONVERT                  ; call the procedure CONVERT
    MOV [BX], AX                  ; set [BX]=hr  , [BX] is pointing to hr
                                  ; in the string DATE

    MOV AL, DH                    ; set AL=CL , CL=minutes
    CALL CONVERT                  ; call the procedure CONVERT
    MOV [BX+3], AX                ; set [BX+3]=min  , [BX] is pointing to min
                                  ; in the string DATE
                              
    MOV AX, CX                   ; set Ax = cx , cx is year
    CALL CONVERT_YEAR                  ; call the procedure CONVERT
    MOV [BX+6], AX                ; set [BX+6]=min  , [BX] is pointing to sec
                                  ; in the string DATE

    POP CX                        ; POP a value from STACK into CX
    POP AX                        ; POP a value from STACK into AX

    RET                           ; return control to the calling procedure
   GET_DATE ENDP                  ; end of procedure GET_DATE
   CONVERT PROC 
    ; this procedure will convert the given binary code into ASCII code
    ; input : AL=binary code
    ; output : AX=ASCII code

    PUSH DX                       ; PUSH DX onto the STACK 

    MOV AH, 0                     ; set AH=0	
    MOV DL, 10                    ; set DL=10
    DIV DL                        ; set AX=AX/DL
    ADD AX, 3030H                 ; convert the binary code in AX into ASCII

    POP DX                        ; POP a value from STACK into DX 

    RET                           ; return control to the calling procedure
   CONVERT ENDP                   ; end of procedure CONVERT
   
   CONVERT_YEAR PROC 
    ; this procedure will convert the given binary code into ASCII code
    ; input : AL=binary code
    ; output : AX=ASCII code

    PUSH DX                       ; PUSH DX onto the STACK 
	PUSH BX
	PUSH CX	

	MOV DX,0000H
	
    MOV BX, 0010                    ; set DL=10
    DIV BX

	MOV CH,DL
	MOV DX,0000H
	
	MOV BX, 0010                    ; set DL=10
    DIV BX
	
	MOV CL,DL
	
	MOV AX,CX
    ADD AX, 3030H                 ; convert the binary code in AX into ASCII

	POP CX
	POP BX
    POP DX                        ; POP a value from STACK into DX 

    RET                           ; return control to the calling procedure
   CONVERT_YEAR ENDP                   ; end of procedure CONVERT
 END MAIN
