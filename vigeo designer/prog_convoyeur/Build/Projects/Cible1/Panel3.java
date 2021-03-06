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

public class Panel3 extends CgpPanel
{
	public Panel3XprSrv exprServer;

	public Switch_0010 Commutateur01;
	public Switch_0016 Commutateur02;
	public Switch_0017 Commutateur03;
	CgpFont F4_0;
	CgpGraphicFile Image01;
	CgpGraphicFile virage_90_HG18;
	CgpGraphicFile virage_90_HD01;
	CgpGraphicFile virage_90_HG01;
	CgpGraphicFile virage_90_HD02;
	CgpGraphicFile virage_90_HD17;
	CgpGraphicFile virage_90_BG16;
	CgpGraphicFile virage_90_HD03;
	CgpGraphicFile virage_90_BG01;
	CgpGraphicFile virage_90_HD04;
	CgpGraphicFile virage_90_BG02;
	CgpGraphicFile virage_90_HD05;
	CgpGraphicFile virage_90_BG03;
	CgpGraphicFile Track_Horizontal;
	CgpGraphicFile Track_Horizontal01;
	CgpGraphicFile Track_Horizontal02;
	CgpGraphicFile Track_Horizontal03;
	CgpGraphicFile Track_Horizontal04;
	CgpGraphicFile Motors15;
	CgpGraphicFile Motors01;
	CgpGraphicFile Motors02;
	CgpGraphicFile Motors03;
	CgpGraphicFile Motors04;
	CgpGraphicFile Motors05;
	private CgpMasterPanel masterPanel = null;
	public int publishedTo()
		{
			return CgpSystem.HMI;
		}

	public void createStaticObjects()
	{
		exprServer = new Panel3XprSrv();

		setBacklightColor(0);
	}
	public String getPanelName()
	{
		return "mode_auto";
	}
	public int getPanelID()
	{
		return 3;
	}

	public void onOpen()
	{
		super.onOpen();

		Integer contextObject = new Integer(panelContext);

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

		Commutateur01 = new Switch_0010(120, 0, 319, 59, panelContext, this);
		Commutateur01.foreClr = 0x00007f00;
		Commutateur01.backClr = 0x00000000;
		Commutateur01.pattern = 1;

		CgpFont	fonts4[];
		String	labels4[];
		fonts4 = new CgpFont[1];
		labels4 = new String[1];

		labels4[0] = "MARCHE";

		F4_0 = new CgpFont("TCP13x23F", CgpFont.BOLD, (byte)23, (byte)13);
		fonts4[0] = F4_0;

		Commutateur01.buzzer = true;

		Commutateur01.switchFonts = fonts4;
		Commutateur01.labels = labels4;

		int intArray0[] = {0x00ffffff, };
		Commutateur01.labelClr = intArray0;
		int intArray1[] = {0x00000000, };
		Commutateur01.label3DClr = intArray1;
		Commutateur01.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Commutateur01.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Commutateur01.bit0 = TagDB.PLC_EquipementModbus01.bp_active;
		Commutateur01.alwaysDrawBackground = false;

		Commutateur01.init();
		Commutateur02 = new Switch_0016(320, 0, 519, 59, panelContext, this);
		Commutateur02.foreClr = 0x000000ff;
		Commutateur02.backClr = 0x00000000;
		Commutateur02.pattern = 1;

		CgpFont	fonts5[];
		String	labels5[];
		fonts5 = new CgpFont[1];
		labels5 = new String[1];

		labels5[0] = "ARRET";
		fonts5[0] = F4_0;

		Commutateur02.buzzer = true;

		Commutateur02.switchFonts = fonts5;
		Commutateur02.labels = labels5;

		Commutateur02.labelClr = intArray0;
		Commutateur02.label3DClr = intArray1;
		Commutateur02.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Commutateur02.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Commutateur02.bit0 = TagDB.PLC_EquipementModbus01.bp_active;
		Commutateur02.bit1 = TagDB.PLC_EquipementModbus01.ARRET_MOT;
		Commutateur02.bit2 = TagDB.PLC_EquipementModbus01.ARRET_MOT;
		Commutateur02.alwaysDrawBackground = false;

		Commutateur02.init();
		Commutateur03 = new Switch_0017(500, 420, 639, 479, panelContext, this);
		Commutateur03.foreClr = 0x007f7f7f;
		Commutateur03.backClr = 0x00000000;
		Commutateur03.pattern = 1;

		CgpFont	fonts76[];
		String	labels76[];
		fonts76 = new CgpFont[1];
		labels76 = new String[1];

		labels76[0] = "PREC";
		fonts76[0] = F4_0;

		Commutateur03.buzzer = true;

		Commutateur03.switchFonts = fonts76;
		Commutateur03.labels = labels76;

		Commutateur03.labelClr = intArray0;
		Commutateur03.label3DClr = intArray1;
		Commutateur03.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Commutateur03.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Commutateur03.bit0 = TagDB.PLC_EquipementModbus01.selec_auto;
		Commutateur03.bit1 = TagDB.PLC_EquipementModbus01.ARRET;
		Commutateur03.bit2 = TagDB.PLC_EquipementModbus01.bp_active;
		Commutateur03.panelChange3 = 2;
		Commutateur03.bit4 = TagDB.PLC_EquipementModbus01.ARRET_MOT;
		Commutateur03.alwaysDrawBackground = false;

		Commutateur03.init();
		virage_90_HG18 = new CgpGraphicFile
		(
			"Bitmap186.bmp",
			0,	// x1
			0,	// y1
			99,	// x2
			59,	// y2
			0,
			CgpColor.makeTransparentColor(0x00000008),	// Transparent color
			this
		);

		virage_90_HD01 = new CgpGraphicFile
		(
			"Bitmap192.bmp",
			0,	// x1
			0,	// y1
			99,	// x2
			59,	// y2
			0,
			CgpColor.makeTransparentColor(0x00000008),	// Transparent color
			this
		);

		virage_90_HG01 = new CgpGraphicFile
		(
			"Bitmap190.bmp",
			0,	// x1
			0,	// y1
			99,	// x2
			59,	// y2
			0,
			CgpColor.makeTransparentColor(0x00000008),	// Transparent color
			this
		);

		virage_90_HD02 = new CgpGraphicFile
		(
			"Bitmap184.bmp",
			0,	// x1
			0,	// y1
			99,	// x2
			59,	// y2
			0,
			CgpColor.makeTransparentColor(0x00000008),	// Transparent color
			this
		);

		virage_90_HD17 = new CgpGraphicFile
		(
			"Bitmap189.bmp",
			0,	// x1
			0,	// y1
			99,	// x2
			39,	// y2
			0,
			CgpColor.makeTransparentColor(0x00000008),	// Transparent color
			this
		);

		virage_90_BG16 = new CgpGraphicFile
		(
			"Bitmap187.bmp",
			0,	// x1
			0,	// y1
			99,	// x2
			65,	// y2
			0,
			CgpColor.makeTransparentColor(0x00000008),	// Transparent color
			this
		);

		virage_90_HD03 = new CgpGraphicFile
		(
			"Bitmap185.bmp",
			0,	// x1
			0,	// y1
			99,	// x2
			39,	// y2
			0,
			CgpColor.makeTransparentColor(0x00000008),	// Transparent color
			this
		);

		virage_90_BG01 = new CgpGraphicFile
		(
			"Bitmap191.bmp",
			0,	// x1
			0,	// y1
			99,	// x2
			64,	// y2
			0,
			CgpColor.makeTransparentColor(0x00000008),	// Transparent color
			this
		);

		virage_90_HD04 = new CgpGraphicFile
		(
			"Bitmap188.bmp",
			0,	// x1
			0,	// y1
			94,	// x2
			39,	// y2
			0,
			CgpColor.makeTransparentColor(0x00000008),	// Transparent color
			this
		);

		virage_90_BG02 = new CgpGraphicFile
		(
			"Bitmap182.bmp",
			0,	// x1
			0,	// y1
			99,	// x2
			64,	// y2
			0,
			CgpColor.makeTransparentColor(0x00000008),	// Transparent color
			this
		);

		virage_90_HD05 = new CgpGraphicFile
		(
			"Bitmap183.bmp",
			0,	// x1
			0,	// y1
			99,	// x2
			39,	// y2
			0,
			CgpColor.makeTransparentColor(0x00000008),	// Transparent color
			this
		);

		virage_90_BG03 = new CgpGraphicFile
		(
			"Bitmap193.bmp",
			0,	// x1
			0,	// y1
			94,	// x2
			65,	// y2
			0,
			CgpColor.makeTransparentColor(0x00000008),	// Transparent color
			this
		);

		Track_Horizontal = new CgpGraphicFile
		(
			"Bitmap194.bmp",
			0,	// x1
			0,	// y1
			199,	// x2
			29,	// y2
			0,
			CgpColor.makeTransparentColor(0x00000008),	// Transparent color
			this
		);

		Track_Horizontal01 = new CgpGraphicFile
		(
			"Bitmap195.bmp",
			0,	// x1
			0,	// y1
			240,	// x2
			29,	// y2
			0,
			CgpColor.makeTransparentColor(0x00000008),	// Transparent color
			this
		);

		Track_Horizontal02 = new CgpGraphicFile
		(
			"Bitmap196.bmp",
			0,	// x1
			0,	// y1
			99,	// x2
			47,	// y2
			0,
			CgpColor.makeTransparentColor(0x00000008),	// Transparent color
			this
		);

		Track_Horizontal03 = new CgpGraphicFile
		(
			"Bitmap197.bmp",
			0,	// x1
			0,	// y1
			79,	// x2
			47,	// y2
			0,
			CgpColor.makeTransparentColor(0x00000008),	// Transparent color
			this
		);

		Track_Horizontal04 = new CgpGraphicFile
		(
			"Bitmap198.bmp",
			0,	// x1
			0,	// y1
			79,	// x2
			45,	// y2
			0,
			CgpColor.makeTransparentColor(0x00000008),	// Transparent color
			this
		);


		Motors15 = new CgpGraphicFile
		(
			"Bitmap362.bmp",
			560,	// x1
			180,	// y1
			619,	// x2
			219,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Motors01 = new CgpGraphicFile
		(
			"Bitmap362.bmp",
			280,	// x1
			120,	// y1
			339,	// x2
			159,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Motors02 = new CgpGraphicFile
		(
			"Bitmap362.bmp",
			40,	// x1
			180,	// y1
			99,	// x2
			219,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Motors03 = new CgpGraphicFile
		(
			"Bitmap362.bmp",
			560,	// x1
			260,	// y1
			619,	// x2
			299,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Motors04 = new CgpGraphicFile
		(
			"Bitmap362.bmp",
			280,	// x1
			320,	// y1
			339,	// x2
			359,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Motors05 = new CgpGraphicFile
		(
			"Bitmap362.bmp",
			40,	// x1
			260,	// y1
			99,	// x2
			299,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);
		((CgpWindow)owner).drawBack();

		CgpVisibilityAnimation Motors15Visible = new CgpVisibilityAnimation
		(
			Motors15,	// object name
			exprServer,
			1000	// index
		);

		CgpVisibilityAnimation Motors01Visible = new CgpVisibilityAnimation
		(
			Motors01,	// object name
			exprServer,
			1001	// index
		);

		CgpVisibilityAnimation Motors02Visible = new CgpVisibilityAnimation
		(
			Motors02,	// object name
			exprServer,
			1002	// index
		);

		CgpVisibilityAnimation Motors03Visible = new CgpVisibilityAnimation
		(
			Motors03,	// object name
			exprServer,
			1003	// index
		);

		CgpVisibilityAnimation Motors04Visible = new CgpVisibilityAnimation
		(
			Motors04,	// object name
			exprServer,
			1004	// index
		);

		CgpVisibilityAnimation Motors05Visible = new CgpVisibilityAnimation
		(
			Motors05,	// object name
			exprServer,
			1005	// index
		);
		TagDB.PLC_EquipementModbus01.M1_S1.addEventListener(Motors15Visible, 0, panelContext);
		TagDB.PLC_EquipementModbus01.M2_S1.addEventListener(Motors01Visible, 0, panelContext);
		TagDB.PLC_EquipementModbus01.M1_S1.addEventListener(Motors02Visible, 0, panelContext);
		TagDB.PLC_EquipementModbus01.M3_S1.addEventListener(Motors03Visible, 0, panelContext);
		TagDB.PLC_EquipementModbus01.M4_S1.addEventListener(Motors04Visible, 0, panelContext);
		TagDB.PLC_EquipementModbus01.M3_S1.addEventListener(Motors05Visible, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[9];
		zOrderList[0] = Commutateur01;
		zOrderList[1] = Commutateur02;
		zOrderList[2] = Commutateur03;
		zOrderList[3] = Motors15;
		zOrderList[4] = Motors01;
		zOrderList[5] = Motors02;
		zOrderList[6] = Motors03;
		zOrderList[7] = Motors04;
		zOrderList[8] = Motors05;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
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
		tagListVector.add(TagDB.PLC_EquipementModbus01.ARRET_MOT);
		tagListVector.add(TagDB.PLC_EquipementModbus01.M1_S1);
		tagListVector.add(TagDB.PLC_EquipementModbus01.M2_S1);
		tagListVector.add(TagDB.PLC_EquipementModbus01.M3_S1);
		tagListVector.add(TagDB.PLC_EquipementModbus01.M4_S1);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();
		Image01.clean();
		virage_90_HG18.clean();
		virage_90_HD01.clean();
		virage_90_HG01.clean();
		virage_90_HD02.clean();
		virage_90_HD17.clean();
		virage_90_BG16.clean();
		virage_90_HD03.clean();
		virage_90_BG01.clean();
		virage_90_HD04.clean();
		virage_90_BG02.clean();
		virage_90_HD05.clean();
		virage_90_BG03.clean();
		Track_Horizontal.clean();
		Track_Horizontal01.clean();
		Track_Horizontal02.clean();
		Track_Horizontal03.clean();
		Track_Horizontal04.clean();
		Motors15.clean();
		Motors01.clean();
		Motors02.clean();
		Motors03.clean();
		Motors04.clean();
		Motors05.clean();

		Commutateur03.shutdown();

		Commutateur02.shutdown();

		Commutateur01.shutdown();
	}

	public boolean drawBackground(int gp)
	{
		CgpCanvas _g = new CgpCanvas(gp);

		// Image01
		_g.drawImage(Image01, 0 + _dx, 0 + _dy);
		// virage_90_HG18
		_g.drawImage(virage_90_HG18, 540 + _dx, 240 + _dy);
		// virage_90_HD01
		_g.drawImage(virage_90_HD01, 540 + _dx, 180 + _dy);
		// virage_90_HG01
		_g.drawImage(virage_90_HG01, 0 + _dx, 180 + _dy);
		// virage_90_HD02
		_g.drawImage(virage_90_HD02, 0 + _dx, 240 + _dy);
		// virage_90_HD17
		_g.drawImage(virage_90_HD17, 360 + _dx, 120 + _dy);
		// virage_90_BG16
		_g.drawImage(virage_90_BG16, 420 + _dx, 160 + _dy);
		// virage_90_HD03
		_g.drawImage(virage_90_HD03, 140 + _dx, 320 + _dy);
		// virage_90_BG01
		_g.drawImage(virage_90_BG01, 80 + _dx, 255 + _dy);
		// virage_90_HD04
		_g.drawImage(virage_90_HD04, 160 + _dx, 120 + _dy);
		// virage_90_BG02
		_g.drawImage(virage_90_BG02, 100 + _dx, 160 + _dy);
		// virage_90_HD05
		_g.drawImage(virage_90_HD05, 385 + _dx, 320 + _dy);
		// virage_90_BG03
		_g.drawImage(virage_90_BG03, 445 + _dx, 254 + _dy);
		// Track_Horizontal
		_g.drawImage(Track_Horizontal, 200 + _dx, 120 + _dy);
		// Track_Horizontal01
		_g.drawImage(Track_Horizontal01, 199 + _dx, 330 + _dy);
		// Track_Horizontal02
		_g.drawImage(Track_Horizontal02, 480 + _dx, 180 + _dy);
		// Track_Horizontal03
		_g.drawImage(Track_Horizontal03, 500 + _dx, 252 + _dy);
		// Track_Horizontal04
		_g.drawImage(Track_Horizontal04, 60 + _dx, 180 + _dy);
		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
