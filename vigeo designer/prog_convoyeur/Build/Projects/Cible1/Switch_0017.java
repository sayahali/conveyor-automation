package Projects.Cible1;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;
import gpclasses.macroobjects.*;
import gpclasses.system.*;
import gpclasses.tags.*;
import gpclasses.util.misc.*;
import gpclasses.util.io.*;
import gpclasses.userScripts.*;

public class Switch_0017 extends CgpSmartObject
{
	private boolean secured = false;
	public int securityLevel = -1;
	public CgpFont[] switchFonts;
	public String[] labels;
	public int langID;

	public int[] labelClr;
	public int[] label3DClr;
	public int direction;

	public int vertAlign;

	public int horzAlign;

	public int	foreClr;
	public int	backClr;
	public int	pattern;
	private boolean	pressed = false;
	public boolean	buzzer = false;

	private String[]	curLabels;
	private CgpFont[]	curFont;
	private CgpCanvas	c;
	public CgpTag	bit0;
	public CgpTag	bit1;
	public CgpTag	bit2;
	public int	panelChange3;
	public CgpTag	bit4;
	public CgpExpressionServer exprServer;
	public CgpGraphicFile overlayImageOff;
	public CgpGraphicFile overlayImageOn;

	public Switch_0017(int _x1, int _y1, int _x2, int _y2, int _contextID, IgpContainer _container)
	{
		super(_x1, _y1, _x2, _y2, 0, _contextID, _container);
	}

	public void drawBackground(CgpCanvas c)
	{
	}

	public void draw(int nHandleDC)
	{
		if (c == null)
			c = new CgpCanvas(nHandleDC);

		Square05.draw(c,x1,y1,x2,y2,
			foreClr,
			backClr,
			pattern,
			pressed,
			0);

		if (overlayImageOff != null)
		{
			int imageWidth = overlayImageOff.getWidth(overlayImageOff.x1, overlayImageOff.x2);
			int imageHeight = overlayImageOff.getHeight(overlayImageOff.y1, overlayImageOff.y2);
			c.drawImage(
				overlayImageOff,
				x1 + (getWidth(x1, x2) - imageWidth) / 2,
				y1 + (getHeight(y1, y2) - imageHeight) / 2
			);
		}

		int labelX = (x1 + 3);
		int labelY = (y1 + 3);
		int labelWidth = (x2 - 3)-(x1 + 3)+1;
		int labelHeight = (y2 - 3)-(y1 + 3)+1;

		curLabels = labels;
		curFont = switchFonts;

		c.drawStringWithBorder(CgpColor.makeTransparentColor(0), labelClr[0], CgpColor.makeTransparentColor(0), label3DClr[0], 1, 1, curLabels[0], labelX, labelY, labelWidth, labelHeight, CgpText.DISPLAY_ANGLE_0, direction, horzAlign, vertAlign, 0, curFont[0]);
	}

	public boolean onVariableChange(CgpDataChangeEvent DataChangeEvent)
	{
		if (DataChangeEvent.tag == TagDB._UserLevel)
		{
			if(CgpSecurityControl.securityControl.testSecurityAccess(securityLevel))
			{
				secured = false;
				this.clearSecured();
			}
			else
			{
				secured = true;
				this.setSecured();
			}
		}
		return true;
	}

	public boolean onPointerPress(CgpPointerEvent PointerEvent)
	{
		if(secured)
		{
			if (drawSecuredType != DRAW_SECURED_INVISIBLE)
			{
				if(CgpSecurityControl.securityControl.lockedObjectLoginPanel > -1)
					CgpTagDB._CurPanelID.write(CgpSecurityControl.securityControl.lockedObjectLoginPanel);
				return false;
			}
			else
			{
				return false;
			}
		}
		if(PointerEvent.getRepeatCount() == 0)
		{
			pressed = true;
			if(buzzer)
				CgpSystem.beep(false);

			// When Actions
			bit0.bitClear();
			bit1.bitSet();
			bit2.bitClear();
			CgpTagDB._CurPanelID.write(panelChange3);
		}

		// While Actions

		return true;
	}

	synchronized public boolean onPointerRelease()
	{
		if (secured)
			return false;
		pressed = false;

		// When Actions

		// While Actions

		// Release Actions
			bit4.bitClear();
		return true;
	}

	public void onInit()
	{
		curFont = switchFonts;
		curLabels = labels;
	}

}

