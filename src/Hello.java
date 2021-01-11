
import pkg.ASCIIArtGenerator.ASCIIArtFont;
import pkg.ASCIIArtGenerator;

public class Hello {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ASCIIArtGenerator artGen = new ASCIIArtGenerator();
		artGen.printTextArt("Hello World !", ASCIIArtGenerator.ART_SIZE_SMALL, ASCIIArtFont.ART_FONT_SANS_SERIF,"*");

	}
}
