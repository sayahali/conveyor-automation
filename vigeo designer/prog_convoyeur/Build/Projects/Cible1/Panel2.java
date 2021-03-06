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

public class Panel2 extends CgpPanel
{
	public CgpNumericDisplay AffichageDate01;
	public CgpNumericDisplay AffichageHeure01;
	public Switch_0013 Commutateur01;
	public Switch_0013 Commutateur02;
	public Switch_0004 Commutateur03;
	public Switch_0005 Commutateur04;
	public Switch_0001 Commutateur05;
	CgpFont F11_0;
	CgpGraphicFile Image01;
	CgpGraphicFile Image02;
	CgpGraphicFile Image03;
	CgpGraphicFile Image04;
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
		return "menu_principale";
	}
	public int getPanelID()
	{
		return 2;
	}

	public void onOpen()
	{
		super.onOpen();

		Integer contextObject = new Integer(panelContext);

		CgpFont textFont0 = new CgpFont("TCP13x23F", CgpFont.PLAIN, (byte)23, (byte)13);

		Image01 = new CgpGraphicFile
		(
			"Bitmap2.bmp",
			0,	// x1
			0,	// y1
			639,	// x2
			479,	// y2
			0,
			0,	// Transparent color
			this
		);


		AffichageDate01 = new CgpNumericDisplay(0, 20, 219, 79, panelContext, this);
		AffichageDate01.dataType = CgpNumericDisplay.DATA_TYPE_DATE;
		AffichageDate01.dateTimeFormat = CgpDate.DD_MM_YYYY;
		AffichageDate01.dateTimeListenVariable = TagDB._Day;
		CgpFont	fonts6[][] = {
			{ textFont0 },
			};
		AffichageDate01.fonts = fonts6;
		AffichageDate01.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		AffichageDate01.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		AffichageDate01.enableInput = false;
		AffichageDate01.barcode = false;
		AffichageDate01.frameColor = 0x006e726e;
		AffichageDate01.foreColor = 0x00d41d19;
		AffichageDate01.textColor = 0x00ffffff;
		AffichageDate01.text3DColor = 0x00000000;
		AffichageDate01.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		AffichageDate01.changeColor = false;
		AffichageDate01.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		CgpNumericDisplayDraw displayDraw0 = new D_DD00001(1,1,1,1);
		AffichageDate01.drawObject = displayDraw0;
		AffichageDate01.alwaysDrawBackground = false;
		AffichageDate01.init();

		AffichageHeure01 = new CgpNumericDisplay(420, 20, 639, 79, panelContext, this);
		AffichageHeure01.dataType = CgpNumericDisplay.DATA_TYPE_TIME;
		AffichageHeure01.dateTimeFormat = CgpDate.H24_MM_SS;
		AffichageHeure01.dateTimeListenVariable = TagDB._Seconds;
		AffichageHeure01.fonts = fonts6;
		AffichageHeure01.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		AffichageHeure01.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		AffichageHeure01.enableInput = false;
		AffichageHeure01.barcode = false;
		AffichageHeure01.frameColor = 0x006e726e;
		AffichageHeure01.foreColor = 0x00d42a19;
		AffichageHeure01.textColor = 0x00ffffff;
		AffichageHeure01.text3DColor = 0x00000000;
		AffichageHeure01.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		AffichageHeure01.changeColor = false;
		AffichageHeure01.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		AffichageHeure01.drawObject = displayDraw0;
		AffichageHeure01.alwaysDrawBackground = false;
		AffichageHeure01.init();

		Image02 = new CgpGraphicFile
		(
			"Bitmap3.bmp",
			340,	// x1
			0,	// y1
			459,	// x2
			99,	// y2
			0,
			0,	// Transparent color
			this
		);
		Image03 = new CgpGraphicFile
		(
			"Bitmap4.bmp",
			0,	// x1
			0,	// y1
			179,	// x2
			219,	// y2
			0,
			0,	// Transparent color
			this
		);

		Commutateur01 = new Switch_0013(200, 140, 399, 199, panelContext, this);
		Commutateur01.foreClr = 0x007f7f7f;
		Commutateur01.backClr = 0x00000000;
		Commutateur01.pattern = 1;

		CgpFont	fonts11[];
		String	labels11[];
		fonts11 = new CgpFont[1];
		labels11 = new String[1];

		labels11[0] = "MODE AUTOMATIQUE";

		F11_0 = new CgpFont("TCP13x23F", CgpFont.BOLD, (byte)23, (byte)13);
		fonts11[0] = F11_0;

		Commutateur01.buzzer = true;

		Commutateur01.switchFonts = fonts11;
		Commutateur01.labels = labels11;

		int intArray0[] = {0x00ffffff, };
		Commutateur01.labelClr = intArray0;
		int intArray1[] = {0x00000000, };
		Commutateur01.label3DClr = intArray1;
		Commutateur01.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Commutateur01.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Commutateur01.bit0 = TagDB.PLC_EquipementModbus01.selec_auto;
		Commutateur01.panelChange1 = 3;
		Commutateur01.alwaysDrawBackground = false;

		Commutateur01.init();
		Commutateur02 = new Switch_0013(200, 300, 399, 359, panelContext, this);
		Commutateur02.foreClr = 0x007f7f7f;
		Commutateur02.backClr = 0x00000000;
		Commutateur02.pattern = 1;

		CgpFont	fonts12[];
		String	labels12[];
		fonts12 = new CgpFont[1];
		labels12 = new String[1];

		labels12[0] = "MODE MANUEL";
		fonts12[0] = F11_0;

		Commutateur02.buzzer = true;

		Commutateur02.switchFonts = fonts12;
		Commutateur02.labels = labels12;

		Commutateur02.labelClr = intArray0;
		Commutateur02.label3DClr = intArray1;
		Commutateur02.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Commutateur02.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Commutateur02.bit0 = TagDB.PLC_EquipementModbus01.selec_man;
		Commutateur02.panelChange1 = 4;
		Commutateur02.alwaysDrawBackground = false;

		Commutateur02.init();
		Commutateur03 = new Switch_0004(440, 300, 639, 359, panelContext, this);
		Commutateur03.foreClr = 0x007f7f7f;
		Commutateur03.backClr = 0x00000000;
		Commutateur03.pattern = 1;

		CgpFont	fonts13[];
		String	labels13[];
		fonts13 = new CgpFont[1];
		labels13 = new String[1];

		labels13[0] = "CONFIGURATION";
		fonts13[0] = F11_0;

		Commutateur03.buzzer = true;

		Commutateur03.switchFonts = fonts13;
		Commutateur03.labels = labels13;

		Commutateur03.labelClr = intArray0;
		Commutateur03.label3DClr = intArray1;
		Commutateur03.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Commutateur03.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Commutateur03.alwaysDrawBackground = false;

		Commutateur03.init();
		Commutateur04 = new Switch_0005(440, 140, 639, 199, panelContext, this);
		Commutateur04.foreClr = 0x007f7f7f;
		Commutateur04.backClr = 0x00000000;
		Commutateur04.pattern = 1;

		CgpFont	fonts14[];
		String	labels14[];
		fonts14 = new CgpFont[1];
		labels14 = new String[1];

		labels14[0] = "JOURNAL D'ERREUR";
		fonts14[0] = F11_0;

		Commutateur04.buzzer = true;

		Commutateur04.switchFonts = fonts14;
		Commutateur04.labels = labels14;

		Commutateur04.labelClr = intArray0;
		Commutateur04.label3DClr = intArray1;
		Commutateur04.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Commutateur04.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Commutateur04.alwaysDrawBackground = false;

		Commutateur04.init();

		Image04 = new CgpGraphicFile
		(
			"Bitmap39.bmp",
			200,	// x1
			0,	// y1
			319,	// x2
			99,	// y2
			0,
			0,	// Transparent color
			this
		);
		Commutateur05 = new Switch_0001(380, 420, 459, 479, panelContext, this);
		Commutateur05.foreClr = 0x007f7f7f;
		Commutateur05.backClr = 0x00000000;
		Commutateur05.pattern = 1;

		CgpFont	fonts21[];
		String	labels21[];
		fonts21 = new CgpFont[1];
		labels21 = new String[1];

		labels21[0] = "PREC";
		fonts21[0] = F11_0;

		Commutateur05.buzzer = true;

		Commutateur05.switchFonts = fonts21;
		Commutateur05.labels = labels21;

		Commutateur05.labelClr = intArray0;
		Commutateur05.label3DClr = intArray1;
		Commutateur05.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Commutateur05.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Commutateur05.panelChange0 = 1;
		Commutateur05.alwaysDrawBackground = false;

		Commutateur05.init();
		((CgpWindow)owner).drawBack();
		TagDB._Day.addEventListener(AffichageDate01, 0, panelContext);
		TagDB._Seconds.addEventListener(AffichageHeure01, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[9];
		zOrderList[0] = AffichageDate01;
		zOrderList[1] = AffichageHeure01;
		zOrderList[2] = Image02;
		zOrderList[3] = Commutateur01;
		zOrderList[4] = Commutateur02;
		zOrderList[5] = Commutateur03;
		zOrderList[6] = Commutateur04;
		zOrderList[7] = Image04;
		zOrderList[8] = Commutateur05;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			Commutateur05,
			Commutateur04,
			Commutateur03,
			Commutateur02,
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
		tagListVector.add(TagDB._Day);
		tagListVector.add(TagDB._Seconds);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();
		Image01.clean();
		Image02.clean();
		Image03.clean();
		Image04.clean();

		Commutateur05.shutdown();

		Commutateur04.shutdown();

		Commutateur03.shutdown();

		Commutateur02.shutdown();

		Commutateur01.shutdown();

		AffichageHeure01.shutdown();

		AffichageDate01.shutdown();
	}

	public boolean drawBackground(int gp)
	{
		CgpCanvas _g = new CgpCanvas(gp);

		// Image01
		_g.drawImage(Image01, 0 + _dx, 0 + _dy);
		AffichageDate01.drawBackground(_g);

		AffichageHeure01.drawBackground(_g);

		// Image03
		_g.drawImage(Image03, 20 + _dx, 140 + _dy);
		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
