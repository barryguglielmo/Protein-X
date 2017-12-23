##To use this program have python 3 installed and make sure to
##pip install the following programs:
##    biopython
##    
###_____________________________________________________#

from tkinter import *
from Bio import Seq

#Define Functions


#main window
window = Tk()
window.title("Protein X")
myLabel = Label(window, text= "\nWelcome to Protein X\n")
myLabel.pack()

#Menu
menubar = Menu(window)
menubar.add_command(label="About", command=window.quit)
window.config(menu = menubar)

#Infile and OutFile
infile = Entry(window)
infile.pack()
infile.insert(0, "Infile.fasta")
outfile = Entry(window)
outfile.pack()
outfile.insert(0, "Outfile.txt")

#Frames
topFrame = Frame(window)
topFrame.pack()
bottomFrame = Frame(window)
bottomFrame.pack(side =BOTTOM)
#Buttons
color = "purple"
button1 = Checkbutton(topFrame, text = "Reverse Complement", fg = color).grid(row=0, sticky=W)
button2 = Checkbutton(topFrame, text = "GC Content", fg = color).grid(row=1, sticky=W)
button1 = Checkbutton(topFrame, text = "Translate", fg = color).grid(row=2, sticky=W)
button2 = Checkbutton(topFrame, text = "Protein Weight", fg = color).grid(row=3, sticky=W)
button3 = Checkbutton(topFrame, text = "Consensus String", fg = color).grid(row=3, sticky=W)

run = Button(window, text = "Run")
run.pack(side=BOTTOM)
#Functions
##def ReverseComplement():
##def GC_Content():
##def Translate():
##def Prot_Weight():
#Main Loop
window.mainloop()
