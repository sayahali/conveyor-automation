package Projects.Cible1;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;

public class LampGreen13
{

public static void drawBackground(CgpCanvas c, int x1, int y1, int x2, int y2)
{
}

public static void draw(CgpCanvas c, int x1, int y1, int x2, int y2, CgpGraphicFile image, boolean pressed, int lamp)
{

		// Image
		if(image != null)
		{
			c.drawImage(
				image,
				(x1 + 0),
				(y1 + 0)
			);

		}
	}
}
