# ImageToASCII
Turns images of various forms to an image composed of ASCII characters based on the brightness of pixels. Returns a .png file containing the output characters on a transparent background. Also prints the characters to fit a standard 80x24 command line window.

## ImgToASCII
### Usage
`ImgToASCII path_to_file samples output_file(w/o_ext) [opt: inverted (y/n)]`
takes command line arguments where:
- `path_to_file` is the local path to file
- `samples` use every nth pixel as the sample
- `output_file` the name of the desired output file
- `inverted` if yes, will return characters such that bright spaces appear dark and vice versa\

Alternatively, ImgToASCII can run without command line arguments. Runtime prompts appear as follows.
```
--------------------------------------------------------------------------------
                      "Convert Image File to ASCII Image"                       
--------------------------------------------------------------------------------
Path/File.ext: road.jpg
Sample 1 px every: 152
File out (w/o ext): road
Invert symbols (y/n): n
```

### Example Output
For the [image](https://www.flickr.com/photos/whitlsam/38721984060/in/album-72157692210518551/)
```
...........................................................:::-++***++++%@@@@@@@@
...............................................................:::::-------------
...............................................................::....::::------::
.................................................................::::.::..:::::::
.        ........................................................................
           ....        .. .......................................................
                            .  ..................................................
                                  ...............................................
               .:               .    ............................................
---:::::.......:=..      .            . .......   ..  ........-:..::::::---:-----
-===============*============----:...       ...:::-======-----+----::::.:::::::--
----------------------------==-=======*#*==========-----=-=---=--:::::::::----:::
---------------==================--====-=------====--==========-=--------======--
-=-=-=-==-=-=-======-=-===-----------------------------=---=-==--===-=-=--=-====-
-=----=-=-=-----=--------------------:--::--------------------=------==-=--------
---=-==-------------------------:::::::=----------------------------===-=--------
-----=-=--=-==---:::-----:--:-::::::::::::-:-::--=--::--=:-:-----------:---------
--=-:::-----:---:::-:--:-::-:=+**#**#########%#%%%+--:----:==:---------------:---
---::--::-:=-::::-:--:-:::::-:::-*+*###########*--+=-:.---:-:::::::-=::-::---::-:
--=::--:::::-=.:::--:-:::::-:...=#######***-=+++*++.-*.-.::-=.:-::::.:--.-::=::=-
=.-...-=*=.:.:..:.#::=:.:::-.-+-+###%###%%%*###*#*-.:: :=.=+..:..-::--==:::-:-.::
. .=::=-:-:-:.-:.:::..*#############%%####%%%%%%%###%%*= = =+* :    .=.:: .= .*--
:=::-.:.::::..-:.=:....:. .:.*****#####*##*---+*****-:+**-..:-::...:.. .:.::-...-
..::-.:::::..-:.::.-:-:::.:.::..=##=*##########*#***#...:.:= ::..:=-......=.:.::.
::.:::::-..:::.:::......::-=*#**######################-: :==.......:.: -...*-....
--:-...:::-:...::.:.:......:=***##################**##+:.::..-:.:-..-. ..--....-:
:::-:::.:.....+#################################%%%#####*++=-=-:+.::..--.--:::...
```

## ConvertFilesToASCII
### Usage
`ConvertFilesToASCII` works in much the same way as `ImgToASCII`. Serves as a wrapper to render many images quickly. Also exports .png files and text to terminal window.
`ConvertFilesToASCII path_to_directory samples frame/img batch_output(w/o_ext) [opt: inverted (y/n)]`
- `path_to-directory` is the path to the root folder where the images are stored
- `samples` take a sample every nth pixel
- `frame/img` render every ith image in the folder
- `batch_output` the name of each file without an extension
- `inverted` render with the alternate character sequence

### Example
A rendered and post-processed example can be viewed [here](https://www.youtube.com/watch?v=GibiNy4d4gc). The original video is linked in the description.
