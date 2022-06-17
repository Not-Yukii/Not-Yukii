# return string without spaces
def erase(cc):
    newText = list(cc)
    for i, char in enumerate(newText):
        tailleText = len(newText)
        if (char == " " and tailleText == 1) or (char == " "
          and newText[max(i-1, int(tailleText > 1))] != " "
          and newText[min(i+1, tailleText-int(tailleText > 1)*2)] != " "):
            del newText[i]
    return "".join(char for char in newText)