import java.util.Scanner;
import java.io.File;

public class ConvertFilesToASCII {
    
    private static final String RENDERED_FOLDER = "Rendered/";
    
    private static String dir = "./";
    private static String x_sam = "2";
    private static int frame_per_img = 2;
    private static String inverted = "n";
    private static String imgOut = "sequence";
    
    public static void main(String[] args) {
        // -------- Input --------
        if ( args.length == 0 ) {
            // Get input via keyboard input
            getInput();
        } else if ( args.length == 4 ) {
            // Input via command line
            dir = args[0];
            x_sam = args[1];
            frame_per_img = Integer.parseInt( args[2] );
            imgOut = args[3];
        } else if ( args.length == 5 ) {
            // input via command line ( with inverted characters )
            dir = args[0];
            x_sam = args[1];
            frame_per_img = Integer.parseInt( args[2] );
            imgOut = args[3];
            inverted = args[4];
        } else {
            System.out.println( "usage: java ConvertFilesToASCII path_to_directory samples frame/img batch_output(w/o_ext) [opt: inverted (y/n)]");
            // Not enough parameters, fail
            System.exit( 1 );
        }
        
        // Make a folder to store the rendered images
        File newFolder = new File( RENDERED_FOLDER );
        newFolder.mkdir();
        
        // First show that the program can read files in a directory
        File[] list = getFiles();
        
        for ( int i = 0; i < list.length; i += frame_per_img ) {
            // System.out.println( list[i] );
            String imgWithIdx = RENDERED_FOLDER + imgOut + i;
            System.out.printf( "Rendering %s %d\n", imgOut, i );
            ImgToASCII.main( new String[]{ list[i].getPath(), x_sam, imgWithIdx, inverted } );
        }
    }
    
    /** Gets a list of the files */
    private static File[] getFiles() {
        File folder = new File( "" + dir );
        return folder.listFiles();
    }
    
    /** Takes input from the keyboard. see below for how it works. */
    public static void getInput() {
        Scanner k = new Scanner( System.in );
        String in = "";
        
        System.out.println( "--------------------------------------------------------------------------------" );
        System.out.println( "                \"Convert Multiple Image Files to ASCII Images\"                  " );
        System.out.println( "--------------------------------------------------------------------------------" );
        
        System.out.print( "Path to directory: " );
        dir = k.nextLine();
        
        System.out.print( "Sample 1 px every: " );
        x_sam = k.nextLine();
        
        System.out.print( "Render 1 frame every: " );
        frame_per_img = k.nextInt();
        
        k.nextLine();
        System.out.print( "Batch file out (w/o ext): " );
        imgOut = k.nextLine();
        
        System.out.print( "Invert symbols (y/n): " );
        String inv = k.nextLine();
        inverted = inv;
        
    }
}