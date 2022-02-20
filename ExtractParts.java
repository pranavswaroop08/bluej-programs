/*WAP toassign full path andfile name as given below. Using library functions, extract and output the file path, file name and the extension separately.Input-> C:\Users\admin\pictures\flower.jpgOutput-> Path: C:\Users\admin\pictures  File name:flowerExtension:jpg   */
//Assigning full path
class ExtractParts
{
    public static void main()
    {
        String s, path, file, extension;
        s="C:\\Users\\admin\\pictures\\flower.jpg";
        int x=s.lastIndexOf('\\');
        path=s.substring(0, x);
        int y=s.indexOf('.');
        file=s.substring(x+1, y);
        extension=s.substring(y+1);
        System.out.println("Path : "+ path);
        System.out.println("File : "+file);
        System.out.println("Extension :"+extension);
    }
}
