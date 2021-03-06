package Projects.Cible1;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;
import gpclasses.macroobjects.*;
import gpclasses.system.*;
import gpclasses.tags.*;
import gpclasses.baseclasses.CgpReferenceTag;
import gpclasses.system.CgpRefTagFactory;
import gpclasses.util.misc.*;
import gpclasses.util.io.*;
import gpclasses.plugins.diag.*;
import gpclasses.plugins.script.*;
import gpclasses.plugins.illuminatedSwitch.*;
import gpclasses.userScripts.*;
import gpclasses.alarms.*;
import java.text.Format;
import java.util.Vector;

public class Panel1 extends CgpPanel
{
	public Switch_0001 Commutateur01;
	CgpFont F15_0;
	CgpGraphicFile Image02;
	private CgpMasterPanel masterPanel = null;
	public int publishedTo()
		{
			return CgpSystem.HMI;
		}

	public void createStaticObjects()
	{

		setBacklightColor(0);
	}
	public String getPanelName()
	{
		return "menu_de_face";
	}
	public int getPanelID()
	{
		return 1;
	}

	public void onOpen()
	{
		super.onOpen();

		Integer contextObject = new Integer(panelContext);

		Image02 = new CgpGraphicFile
		(
			"Bitmap1.bmp",
			0,	// x1
			0,	// y1
			639,	// x2
			359,	// y2
			0,
			0,	// Transparent color
			this
		);

		Commutateur01 = new Switch_0001(20, 20, 619, 99, panelContext, this);
		Commutateur01.foreClr = 0x007f7f7f;
		Commutateur01.backClr = 0x00000000;
		Commutateur01.pattern = 1;

		CgpFont	fonts15[];
		String	labels15[];
		fonts15 = new CgpFont[1];
		labels15 = new String[1];

		labels15[0] = "CONVOYEUR TRANSEPT";

		F15_0 = new CgpFont("TCP28x50", CgpFont.EMPHASIZED, (byte)50, (byte)28);
		fonts15[0] = F15_0;

		Commutateur01.buzzer = true;

		Commutateur01.switchFonts = fonts15;
		Commutateur01.labels = labels15;

		int intArray0[] = {0x00ffffff, };
		Commutateur01.labelClr = intArray0;
		int intArray1[] = {0x003333e6, };
		Commutateur01.label3DClr = intArray1;
		Commutateur01.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Commutateur01.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Commutateur01.panelChange0 = 2;
		Commutateur01.alwaysDrawBackground = false;

		Commutateur01.init();
		((CgpWindow)owner).drawBack();

		CgpGraphics zOrderList[] = new CgpGraphics[1];
		zOrderList[0] = Commutateur01;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			Commutateur01,
		};

		registerTouchList(touchList);

		registerTagList();
		postOnOpen();
	}

	public void registerTagList()
	{
		Vector tagListVector = new Vector();
		tagListVector.add(TagDB._UserApplicationLanguage);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();
		Image02.clean();

		Commutateur01.shutdown();
	}

	public boolean drawBackground(int gp)
	{
		CgpCanvas _g = new CgpCanvas(gp);

		// Image02
		_g.drawImage(Image02, 0 + _dx, 120 + _dy);
		// Rectangle01
		_g.fillRectWithBorder
		(
			0x00ffffff,	// border color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			0 + _dx,	// x
			0 + _dy,	// y
			640,	// width
			120,	// height
			0x00c3bfc3,	// fg color
			0x00000000,	// bg color
			1,	// fill pattern
			CgpRectangle.SQUARE_CORNERS,	// corner type
			60,	// arc width
			60	// arc height
		);
		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
