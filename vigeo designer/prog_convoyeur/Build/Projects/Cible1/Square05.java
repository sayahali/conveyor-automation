package Projects.Cible1;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;

public class Square05
{

public static void drawBackground(CgpCanvas c, int x1, int y1, int x2, int y2)
{
}

public static void draw(CgpCanvas c, int x1, int y1, int x2, int y2, int foreClr, int backClr, int pattern, boolean pressed, int lamp)
{
if(pressed)
{
	if(lamp > 0)
	{
		// 3DRect
		c.drawBevelButton(
			(x1 + 0),
			(y1 + 0),
			(x2 - 0),
			(y2 - 0),
			foreClr,	// ForeColor
			backClr,	// BackColor
			pattern,	// Pattern
			0x00000000,	// LineColor
			0x00ffffff,	// ShadowColor
			3	// line width
		);

	}
	else
	{
		// 3DRect
		c.drawBevelButton(
			(x1 + 0),
			(y1 + 0),
			(x2 - 0),
			(y2 - 0),
			foreClr,	// ForeColor
			backClr,	// BackColor
			pattern,	// Pattern
			0x00000000,	// LineColor
			0x00ffffff,	// ShadowColor
			3	// line width
		);

	}
}
else
{
	if(lamp > 0)
	{
		// 3DRect
		c.drawBevelButton(
			(x1 + 0),
			(y1 + 0),
			(x2 - 0),
			(y2 - 0),
			foreClr,	// ForeColor
			backClr,	// BackColor
			pattern,	// Pattern
			0x00ffffff,	// LineColor
			0x00000000,	// ShadowColor
			3	// line width
		);

	}
	else
	{
		// 3DRect
		c.drawBevelButton(
			(x1 + 0),
			(y1 + 0),
			(x2 - 0),
			(y2 - 0),
			foreClr,	// ForeColor
			backClr,	// BackColor
			pattern,	// Pattern
			0x00ffffff,	// LineColor
			0x00000000,	// ShadowColor
			3	// line width
		);

	}
}
}
}
