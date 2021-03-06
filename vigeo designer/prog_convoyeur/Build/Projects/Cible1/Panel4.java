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

public class Panel4 extends CgpPanel
{
	public Switch_0014 RunSwitch03;
	public Switch_0014 StopSwitch03;
	public Lamp_0008 RunLamp03;
	public Switch_0014 RunSwitch01;
	public Switch_0014 StopSwitch01;
	public Lamp_0008 RunLamp01;
	public Switch_0014 RunSwitch;
	public Switch_0014 StopSwitch;
	public Lamp_0008 RunLamp;
	public Lamp_0009 ErrorLamp;
	public Switch_0014 RunSwitch02;
	public Switch_0014 StopSwitch02;
	public Lamp_0008 RunLamp02;
	public Switch_0014 StopSwitch04;
	public Switch_0014 StopSwitch05;
	public Switch_0014 StopSwitch06;
	public Switch_0014 StopSwitch07;
	public Lamp_0010 StopLamp;
	public Lamp_0010 StopLamp01;
	public Lamp_0010 StopLamp02;
	public Lamp_0010 StopLamp03;
	public Switch_0015 Commutateur01;
	public Lamp_0009 ErrorLamp01;
	public Lamp_0009 ErrorLamp02;
	public Lamp_0009 ErrorLamp03;
	CgpFont F19_0;
	CgpFont F56;
	CgpGraphicFile Image01;
	CgpGraphicFile nativeImage0;
	CgpGraphicFile nativeImage1;
	CgpGraphicFile nativeImage2;
	CgpGraphicFile nativeImage3;
	CgpGraphicFile nativeImage4;
	CgpGraphicFile nativeImage5;
	CgpGraphicFile nativeImage6;
	CgpGraphicFile nativeImage7;
	CgpGraphicFile nativeImage8;
	CgpGraphicFile nativeImage9;
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
		return "moteurs";
	}
	public int getPanelID()
	{
		return 4;
	}

	public void onOpen()
	{
		super.onOpen();

		Integer contextObject = new Integer(panelContext);

		F56 = new CgpFont("TCP13x23F", CgpFont.BOLD, (byte)23, (byte)13);

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

		RunSwitch03 = new Switch_0014(360, 141, 439, 199, panelContext, this);
		nativeImage0 = new CgpGraphicFile( "Bitmap6.bmp", 0, 0, 79, 58, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		RunSwitch03.image01 = nativeImage0;
		nativeImage1 = new CgpGraphicFile( "Bitmap7.bmp", 0, 0, 79, 58, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		RunSwitch03.image02 = nativeImage1;

		CgpFont	fonts19[];
		String	labels19[];
		fonts19 = new CgpFont[1];
		labels19 = new String[1];

		labels19[0] = "SENS 1";

		F19_0 = new CgpFont("PF Utah (WF) S", CgpFont.BOLD, (byte)20, (byte)0);
		fonts19[0] = F19_0;

		RunSwitch03.buzzer = true;

		RunSwitch03.switchFonts = fonts19;
		RunSwitch03.labels = labels19;

		int intArray0[] = {0x00000000, };
		RunSwitch03.labelClr = intArray0;
		RunSwitch03.label3DClr = intArray0;
		RunSwitch03.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		RunSwitch03.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		RunSwitch03.bit0 = TagDB.PLC_EquipementModbus01.BP_M3_S1;
		RunSwitch03.bit1 = TagDB.PLC_EquipementModbus01.BP_M3_S1;
		RunSwitch03.alwaysDrawBackground = false;

		RunSwitch03.init();
		StopSwitch03 = new Switch_0014(460, 140, 539, 199, panelContext, this);
		nativeImage2 = new CgpGraphicFile( "Bitmap8.bmp", 0, 0, 79, 59, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		StopSwitch03.image01 = nativeImage2;
		nativeImage3 = new CgpGraphicFile( "Bitmap9.bmp", 0, 0, 79, 59, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		StopSwitch03.image02 = nativeImage3;

		CgpFont	fonts18[];
		String	labels18[];
		fonts18 = new CgpFont[1];
		labels18 = new String[1];

		labels18[0] = "ARRET";
		fonts18[0] = F19_0;

		StopSwitch03.buzzer = true;

		StopSwitch03.switchFonts = fonts18;
		StopSwitch03.labels = labels18;

		StopSwitch03.labelClr = intArray0;
		StopSwitch03.label3DClr = intArray0;
		StopSwitch03.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		StopSwitch03.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		StopSwitch03.bit0 = TagDB.PLC_EquipementModbus01.ARRET_MOT;
		StopSwitch03.bit1 = TagDB.PLC_EquipementModbus01.ARRET_MOT;
		StopSwitch03.alwaysDrawBackground = false;

		StopSwitch03.init();
		RunLamp03 = new Lamp_0008(380, 60, 439, 118, panelContext, this);
		RunLamp03.controlTag01 = TagDB.PLC_EquipementModbus01.M3_S1;
		nativeImage4 = new CgpGraphicFile( "Bitmap10.bmp", 0, 0, 59, 58, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		nativeImage5 = new CgpGraphicFile( "Bitmap11.bmp", 0, 0, 59, 58, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		CgpGraphicFile imageArray1[] = {nativeImage4, nativeImage5, };
		RunLamp03.imageFiles = imageArray1;
		RunLamp03.alwaysDrawBackground = false;

		RunLamp03.init();
		RunSwitch01 = new Switch_0014(360, 400, 439, 458, panelContext, this);
		RunSwitch01.image01 = nativeImage0;
		RunSwitch01.image02 = nativeImage1;

		CgpFont	fonts29[];
		String	labels29[];
		fonts29 = new CgpFont[1];
		labels29 = new String[1];

		labels29[0] = "SENS 1";
		fonts29[0] = F19_0;

		RunSwitch01.buzzer = true;

		RunSwitch01.switchFonts = fonts29;
		RunSwitch01.labels = labels29;

		RunSwitch01.labelClr = intArray0;
		RunSwitch01.label3DClr = intArray0;
		RunSwitch01.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		RunSwitch01.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		RunSwitch01.bit0 = TagDB.PLC_EquipementModbus01.BP_M4_S1;
		RunSwitch01.bit1 = TagDB.PLC_EquipementModbus01.BP_M4_S1;
		RunSwitch01.alwaysDrawBackground = false;

		RunSwitch01.init();
		StopSwitch01 = new Switch_0014(460, 400, 539, 459, panelContext, this);
		StopSwitch01.image01 = nativeImage2;
		StopSwitch01.image02 = nativeImage3;

		CgpFont	fonts28[];
		String	labels28[];
		fonts28 = new CgpFont[1];
		labels28 = new String[1];

		labels28[0] = "ARRET";
		fonts28[0] = F19_0;

		StopSwitch01.buzzer = true;

		StopSwitch01.switchFonts = fonts28;
		StopSwitch01.labels = labels28;

		StopSwitch01.labelClr = intArray0;
		StopSwitch01.label3DClr = intArray0;
		StopSwitch01.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		StopSwitch01.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		StopSwitch01.bit0 = TagDB.PLC_EquipementModbus01.ARRET_MOT;
		StopSwitch01.bit1 = TagDB.PLC_EquipementModbus01.ARRET_MOT;
		StopSwitch01.alwaysDrawBackground = false;

		StopSwitch01.init();
		RunLamp01 = new Lamp_0008(380, 320, 439, 378, panelContext, this);
		RunLamp01.controlTag01 = TagDB.PLC_EquipementModbus01.M4_S1;
		RunLamp01.imageFiles = imageArray1;
		RunLamp01.alwaysDrawBackground = false;

		RunLamp01.init();
		RunSwitch = new Switch_0014(0, 400, 79, 458, panelContext, this);
		RunSwitch.image01 = nativeImage0;
		RunSwitch.image02 = nativeImage1;

		CgpFont	fonts39[];
		String	labels39[];
		fonts39 = new CgpFont[1];
		labels39 = new String[1];

		labels39[0] = "SENS 1";
		fonts39[0] = F19_0;

		RunSwitch.buzzer = true;

		RunSwitch.switchFonts = fonts39;
		RunSwitch.labels = labels39;

		RunSwitch.labelClr = intArray0;
		RunSwitch.label3DClr = intArray0;
		RunSwitch.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		RunSwitch.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		RunSwitch.bit0 = TagDB.PLC_EquipementModbus01.BP_M2_S1;
		RunSwitch.bit1 = TagDB.PLC_EquipementModbus01.BP_M2_S1;
		RunSwitch.alwaysDrawBackground = false;

		RunSwitch.init();
		StopSwitch = new Switch_0014(100, 400, 179, 459, panelContext, this);
		StopSwitch.image01 = nativeImage2;
		StopSwitch.image02 = nativeImage3;

		CgpFont	fonts38[];
		String	labels38[];
		fonts38 = new CgpFont[1];
		labels38 = new String[1];

		labels38[0] = "ARRET";
		fonts38[0] = F19_0;

		StopSwitch.buzzer = true;

		StopSwitch.switchFonts = fonts38;
		StopSwitch.labels = labels38;

		StopSwitch.labelClr = intArray0;
		StopSwitch.label3DClr = intArray0;
		StopSwitch.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		StopSwitch.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		StopSwitch.bit0 = TagDB.PLC_EquipementModbus01.ARRET_MOT;
		StopSwitch.bit1 = TagDB.PLC_EquipementModbus01.ARRET_MOT;
		StopSwitch.alwaysDrawBackground = false;

		StopSwitch.init();
		RunLamp = new Lamp_0008(20, 321, 79, 379, panelContext, this);
		RunLamp.controlTag01 = TagDB.PLC_EquipementModbus01.M2_S1;
		RunLamp.imageFiles = imageArray1;
		RunLamp.alwaysDrawBackground = false;

		RunLamp.init();
		ErrorLamp = new Lamp_0009(120, 320, 179, 379, panelContext, this);
		ErrorLamp.controlTag01 = TagDB.PLC_EquipementModbus01.ARRET_MOT;
		nativeImage6 = new CgpGraphicFile( "Bitmap12.bmp", 0, 0, 59, 59, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		nativeImage7 = new CgpGraphicFile( "Bitmap13.bmp", 0, 0, 59, 59, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		CgpGraphicFile imageArray2[] = {nativeImage6, nativeImage7, };
		ErrorLamp.imageFiles = imageArray2;
		ErrorLamp.alwaysDrawBackground = false;

		ErrorLamp.init();
		RunSwitch02 = new Switch_0014(0, 140, 79, 198, panelContext, this);
		RunSwitch02.image01 = nativeImage0;
		RunSwitch02.image02 = nativeImage1;

		CgpFont	fonts49[];
		String	labels49[];
		fonts49 = new CgpFont[1];
		labels49 = new String[1];

		labels49[0] = "SENS 1";
		fonts49[0] = F19_0;

		RunSwitch02.buzzer = true;

		RunSwitch02.switchFonts = fonts49;
		RunSwitch02.labels = labels49;

		RunSwitch02.labelClr = intArray0;
		RunSwitch02.label3DClr = intArray0;
		RunSwitch02.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		RunSwitch02.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		RunSwitch02.bit0 = TagDB.PLC_EquipementModbus01.BP_M1_S1;
		RunSwitch02.bit1 = TagDB.PLC_EquipementModbus01.BP_M1_S1;
		RunSwitch02.alwaysDrawBackground = false;

		RunSwitch02.init();
		StopSwitch02 = new Switch_0014(100, 140, 179, 199, panelContext, this);
		StopSwitch02.image01 = nativeImage2;
		StopSwitch02.image02 = nativeImage3;

		CgpFont	fonts48[];
		String	labels48[];
		fonts48 = new CgpFont[1];
		labels48 = new String[1];

		labels48[0] = "ARRET";
		fonts48[0] = F19_0;

		StopSwitch02.buzzer = true;

		StopSwitch02.switchFonts = fonts48;
		StopSwitch02.labels = labels48;

		StopSwitch02.labelClr = intArray0;
		StopSwitch02.label3DClr = intArray0;
		StopSwitch02.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		StopSwitch02.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		StopSwitch02.bit0 = TagDB.PLC_EquipementModbus01.ARRET_MOT;
		StopSwitch02.bit1 = TagDB.PLC_EquipementModbus01.ARRET_MOT;
		StopSwitch02.alwaysDrawBackground = false;

		StopSwitch02.init();
		RunLamp02 = new Lamp_0008(20, 61, 79, 119, panelContext, this);
		RunLamp02.controlTag01 = TagDB.PLC_EquipementModbus01.M1_S1;
		RunLamp02.imageFiles = imageArray1;
		RunLamp02.alwaysDrawBackground = false;

		RunLamp02.init();
		StopSwitch04 = new Switch_0014(200, 140, 279, 199, panelContext, this);
		StopSwitch04.image01 = nativeImage2;
		StopSwitch04.image02 = nativeImage3;

		CgpFont	fonts60[];
		String	labels60[];
		fonts60 = new CgpFont[1];
		labels60 = new String[1];

		labels60[0] = "SENS 2";
		fonts60[0] = F19_0;

		StopSwitch04.buzzer = true;

		StopSwitch04.switchFonts = fonts60;
		StopSwitch04.labels = labels60;

		StopSwitch04.labelClr = intArray0;
		StopSwitch04.label3DClr = intArray0;
		StopSwitch04.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		StopSwitch04.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		StopSwitch04.bit0 = TagDB.PLC_EquipementModbus01.BP_M1_S2;
		StopSwitch04.bit1 = TagDB.PLC_EquipementModbus01.BP_M1_S2;
		StopSwitch04.alwaysDrawBackground = false;

		StopSwitch04.init();
		StopSwitch05 = new Switch_0014(560, 140, 639, 199, panelContext, this);
		StopSwitch05.image01 = nativeImage2;
		StopSwitch05.image02 = nativeImage3;

		CgpFont	fonts63[];
		String	labels63[];
		fonts63 = new CgpFont[1];
		labels63 = new String[1];

		labels63[0] = "SENS 2";
		fonts63[0] = F19_0;

		StopSwitch05.buzzer = true;

		StopSwitch05.switchFonts = fonts63;
		StopSwitch05.labels = labels63;

		StopSwitch05.labelClr = intArray0;
		StopSwitch05.label3DClr = intArray0;
		StopSwitch05.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		StopSwitch05.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		StopSwitch05.bit0 = TagDB.PLC_EquipementModbus01.BP_M3_S2;
		StopSwitch05.bit1 = TagDB.PLC_EquipementModbus01.BP_M3_S2;
		StopSwitch05.alwaysDrawBackground = false;

		StopSwitch05.init();
		StopSwitch06 = new Switch_0014(200, 400, 279, 459, panelContext, this);
		StopSwitch06.image01 = nativeImage2;
		StopSwitch06.image02 = nativeImage3;

		CgpFont	fonts64[];
		String	labels64[];
		fonts64 = new CgpFont[1];
		labels64 = new String[1];

		labels64[0] = "SENS 2";
		fonts64[0] = F19_0;

		StopSwitch06.buzzer = true;

		StopSwitch06.switchFonts = fonts64;
		StopSwitch06.labels = labels64;

		StopSwitch06.labelClr = intArray0;
		StopSwitch06.label3DClr = intArray0;
		StopSwitch06.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		StopSwitch06.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		StopSwitch06.bit0 = TagDB.PLC_EquipementModbus01.BP_M2_S2;
		StopSwitch06.bit1 = TagDB.PLC_EquipementModbus01.BP_M2_S2;
		StopSwitch06.alwaysDrawBackground = false;

		StopSwitch06.init();
		StopSwitch07 = new Switch_0014(560, 400, 639, 459, panelContext, this);
		StopSwitch07.image01 = nativeImage2;
		StopSwitch07.image02 = nativeImage3;

		CgpFont	fonts65[];
		String	labels65[];
		fonts65 = new CgpFont[1];
		labels65 = new String[1];

		labels65[0] = "SENS 2";
		fonts65[0] = F19_0;

		StopSwitch07.buzzer = true;

		StopSwitch07.switchFonts = fonts65;
		StopSwitch07.labels = labels65;

		StopSwitch07.labelClr = intArray0;
		StopSwitch07.label3DClr = intArray0;
		StopSwitch07.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		StopSwitch07.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		StopSwitch07.bit0 = TagDB.PLC_EquipementModbus01.BP_M4_S2;
		StopSwitch07.bit1 = TagDB.PLC_EquipementModbus01.BP_M4_S2;
		StopSwitch07.alwaysDrawBackground = false;

		StopSwitch07.init();
		StopLamp = new Lamp_0010(220, 61, 279, 119, panelContext, this);
		StopLamp.controlTag01 = TagDB.PLC_EquipementModbus01.M1_S2;
		nativeImage8 = new CgpGraphicFile( "Bitmap82.bmp", 0, 0, 59, 58, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		nativeImage9 = new CgpGraphicFile( "Bitmap83.bmp", 0, 0, 59, 58, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		CgpGraphicFile imageArray3[] = {nativeImage8, nativeImage9, };
		StopLamp.imageFiles = imageArray3;
		StopLamp.alwaysDrawBackground = false;

		StopLamp.init();
		StopLamp01 = new Lamp_0010(580, 61, 639, 119, panelContext, this);
		StopLamp01.controlTag01 = TagDB.PLC_EquipementModbus01.M3_S2;
		StopLamp01.imageFiles = imageArray3;
		StopLamp01.alwaysDrawBackground = false;

		StopLamp01.init();
		StopLamp02 = new Lamp_0010(220, 320, 279, 378, panelContext, this);
		StopLamp02.controlTag01 = TagDB.PLC_EquipementModbus01.M2_S2;
		StopLamp02.imageFiles = imageArray3;
		StopLamp02.alwaysDrawBackground = false;

		StopLamp02.init();
		StopLamp03 = new Lamp_0010(580, 320, 639, 378, panelContext, this);
		StopLamp03.controlTag01 = TagDB.PLC_EquipementModbus01.M4_S2;
		StopLamp03.imageFiles = imageArray3;
		StopLamp03.alwaysDrawBackground = false;

		StopLamp03.init();
		Commutateur01 = new Switch_0015(280, 240, 359, 299, panelContext, this);
		Commutateur01.foreClr = 0x007f7f7f;
		Commutateur01.backClr = 0x00000000;
		Commutateur01.pattern = 1;

		CgpFont	fonts90[];
		String	labels90[];
		fonts90 = new CgpFont[1];
		labels90 = new String[1];

		labels90[0] = "PREC";
		fonts90[0] = F56;

		Commutateur01.buzzer = true;

		Commutateur01.switchFonts = fonts90;
		Commutateur01.labels = labels90;

		int intArray4[] = {0x00ffffff, };
		Commutateur01.labelClr = intArray4;
		Commutateur01.label3DClr = intArray0;
		Commutateur01.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Commutateur01.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Commutateur01.bit0 = TagDB.PLC_EquipementModbus01.selec_man;
		Commutateur01.bit1 = TagDB.PLC_EquipementModbus01.ARRET_MOT;
		Commutateur01.panelChange2 = 2;
		Commutateur01.bit3 = TagDB.PLC_EquipementModbus01.ARRET_MOT;
		Commutateur01.alwaysDrawBackground = false;

		Commutateur01.init();
		ErrorLamp01 = new Lamp_0009(120, 60, 179, 119, panelContext, this);
		ErrorLamp01.controlTag01 = TagDB.PLC_EquipementModbus01.ARRET_MOT;
		ErrorLamp01.imageFiles = imageArray2;
		ErrorLamp01.alwaysDrawBackground = false;

		ErrorLamp01.init();
		ErrorLamp02 = new Lamp_0009(480, 60, 539, 119, panelContext, this);
		ErrorLamp02.controlTag01 = TagDB.PLC_EquipementModbus01.ARRET_MOT;
		ErrorLamp02.imageFiles = imageArray2;
		ErrorLamp02.alwaysDrawBackground = false;

		ErrorLamp02.init();
		ErrorLamp03 = new Lamp_0009(480, 320, 539, 379, panelContext, this);
		ErrorLamp03.controlTag01 = TagDB.PLC_EquipementModbus01.ARRET_MOT;
		ErrorLamp03.imageFiles = imageArray2;
		ErrorLamp03.alwaysDrawBackground = false;

		ErrorLamp03.init();
		((CgpWindow)owner).drawBack();
		TagDB.PLC_EquipementModbus01.M3_S1.addEventListener(RunLamp03, 0, panelContext);
		TagDB.PLC_EquipementModbus01.M4_S1.addEventListener(RunLamp01, 0, panelContext);
		TagDB.PLC_EquipementModbus01.M2_S1.addEventListener(RunLamp, 0, panelContext);
		TagDB.PLC_EquipementModbus01.ARRET_MOT.addEventListener(ErrorLamp, 0, panelContext);
		TagDB.PLC_EquipementModbus01.M1_S1.addEventListener(RunLamp02, 0, panelContext);
		TagDB.PLC_EquipementModbus01.M1_S2.addEventListener(StopLamp, 0, panelContext);
		TagDB.PLC_EquipementModbus01.M3_S2.addEventListener(StopLamp01, 0, panelContext);
		TagDB.PLC_EquipementModbus01.M2_S2.addEventListener(StopLamp02, 0, panelContext);
		TagDB.PLC_EquipementModbus01.M4_S2.addEventListener(StopLamp03, 0, panelContext);
		TagDB.PLC_EquipementModbus01.ARRET_MOT.addEventListener(ErrorLamp01, 0, panelContext);
		TagDB.PLC_EquipementModbus01.ARRET_MOT.addEventListener(ErrorLamp02, 0, panelContext);
		TagDB.PLC_EquipementModbus01.ARRET_MOT.addEventListener(ErrorLamp03, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[25];
		zOrderList[0] = RunSwitch03;
		zOrderList[1] = StopSwitch03;
		zOrderList[2] = RunLamp03;
		zOrderList[3] = RunSwitch01;
		zOrderList[4] = StopSwitch01;
		zOrderList[5] = RunLamp01;
		zOrderList[6] = RunSwitch;
		zOrderList[7] = StopSwitch;
		zOrderList[8] = RunLamp;
		zOrderList[9] = ErrorLamp;
		zOrderList[10] = RunSwitch02;
		zOrderList[11] = StopSwitch02;
		zOrderList[12] = RunLamp02;
		zOrderList[13] = StopSwitch04;
		zOrderList[14] = StopSwitch05;
		zOrderList[15] = StopSwitch06;
		zOrderList[16] = StopSwitch07;
		zOrderList[17] = StopLamp;
		zOrderList[18] = StopLamp01;
		zOrderList[19] = StopLamp02;
		zOrderList[20] = StopLamp03;
		zOrderList[21] = Commutateur01;
		zOrderList[22] = ErrorLamp01;
		zOrderList[23] = ErrorLamp02;
		zOrderList[24] = ErrorLamp03;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			Commutateur01,
			StopSwitch07,
			StopSwitch06,
			StopSwitch05,
			StopSwitch04,
			StopSwitch02,
			RunSwitch02,
			StopSwitch,
			RunSwitch,
			StopSwitch01,
			RunSwitch01,
			StopSwitch03,
			RunSwitch03,
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
		tagListVector.add(TagDB.PLC_EquipementModbus01.M1_S2);
		tagListVector.add(TagDB.PLC_EquipementModbus01.M2_S1);
		tagListVector.add(TagDB.PLC_EquipementModbus01.M2_S2);
		tagListVector.add(TagDB.PLC_EquipementModbus01.M3_S1);
		tagListVector.add(TagDB.PLC_EquipementModbus01.M3_S2);
		tagListVector.add(TagDB.PLC_EquipementModbus01.M4_S1);
		tagListVector.add(TagDB.PLC_EquipementModbus01.M4_S2);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();
		Image01.clean();
		nativeImage0.clean();
		nativeImage1.clean();
		nativeImage2.clean();
		nativeImage3.clean();
		nativeImage4.clean();
		nativeImage5.clean();
		nativeImage6.clean();
		nativeImage7.clean();
		nativeImage8.clean();
		nativeImage9.clean();

		ErrorLamp03.shutdown();

		ErrorLamp02.shutdown();

		ErrorLamp01.shutdown();

		Commutateur01.shutdown();

		StopLamp03.shutdown();

		StopLamp02.shutdown();

		StopLamp01.shutdown();

		StopLamp.shutdown();

		StopSwitch07.shutdown();

		StopSwitch06.shutdown();

		StopSwitch05.shutdown();

		StopSwitch04.shutdown();

		RunLamp02.shutdown();

		StopSwitch02.shutdown();

		RunSwitch02.shutdown();

		ErrorLamp.shutdown();

		RunLamp.shutdown();

		StopSwitch.shutdown();

		RunSwitch.shutdown();

		RunLamp01.shutdown();

		StopSwitch01.shutdown();

		RunSwitch01.shutdown();

		RunLamp03.shutdown();

		StopSwitch03.shutdown();

		RunSwitch03.shutdown();
	}

	public boolean drawBackground(int gp)
	{
		CgpCanvas _g = new CgpCanvas(gp);

		// Image01
		_g.drawImage(Image01, 0 + _dx, 0 + _dy);
		// ControllerFrame03
		_g.fillRectWithBorder
		(
			0x00ffffff,	// border color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			360 + _dx,	// x
			60 + _dy,	// y
			280,	// width
			160,	// height
			0x00a1aaa1,	// fg color
			0x00000000,	// bg color
			1,	// fill pattern
			CgpRectangle.ARC_CORNERS,	// corner type
			20,	// arc width
			20	// arc height
		);
		// ControllerFrame01
		_g.fillRectWithBorder
		(
			0x00ffffff,	// border color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			360 + _dx,	// x
			320 + _dy,	// y
			280,	// width
			160,	// height
			0x00a1aaa1,	// fg color
			0x00000000,	// bg color
			1,	// fill pattern
			CgpRectangle.ARC_CORNERS,	// corner type
			20,	// arc width
			20	// arc height
		);
		// ControllerFrame
		_g.fillRectWithBorder
		(
			0x00ffffff,	// border color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			0 + _dx,	// x
			320 + _dy,	// y
			280,	// width
			160,	// height
			0x00a1aaa1,	// fg color
			0x00000000,	// bg color
			1,	// fill pattern
			CgpRectangle.ARC_CORNERS,	// corner type
			20,	// arc width
			20	// arc height
		);
		// ControllerFrame02
		_g.fillRectWithBorder
		(
			0x00ffffff,	// border color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			0 + _dx,	// x
			60 + _dy,	// y
			280,	// width
			160,	// height
			0x00a1aaa1,	// fg color
			0x00000000,	// bg color
			1,	// fill pattern
			CgpRectangle.ARC_CORNERS,	// corner type
			20,	// arc width
			20	// arc height
		);
		// Rectangle01
		_g.fillRectWithBorder
		(
			0x00ffffff,	// border color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			40 + _dx,	// x
			0 + _dy,	// y
			220,	// width
			60,	// height
			0x007f7f7f,	// fg color
			0x00000000,	// bg color
			1,	// fill pattern
			CgpRectangle.SQUARE_CORNERS,	// corner type
			30,	// arc width
			30	// arc height
		);
		// Rectangle02
		_g.fillRectWithBorder
		(
			0x00ffffff,	// border color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			380 + _dx,	// x
			0 + _dy,	// y
			220,	// width
			60,	// height
			0x007f7f7f,	// fg color
			0x00000000,	// bg color
			1,	// fill pattern
			CgpRectangle.SQUARE_CORNERS,	// corner type
			30,	// arc width
			30	// arc height
		);
		// Rectangle03
		_g.fillRectWithBorder
		(
			0x00ffffff,	// border color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			40 + _dx,	// x
			260 + _dy,	// y
			220,	// width
			60,	// height
			0x007f7f7f,	// fg color
			0x00000000,	// bg color
			1,	// fill pattern
			CgpRectangle.SQUARE_CORNERS,	// corner type
			30,	// arc width
			30	// arc height
		);
		// Rectangle04
		_g.fillRectWithBorder
		(
			0x00ffffff,	// border color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			380 + _dx,	// x
			260 + _dy,	// y
			220,	// width
			60,	// height
			0x007f7f7f,	// fg color
			0x00000000,	// bg color
			1,	// fill pattern
			CgpRectangle.SQUARE_CORNERS,	// corner type
			30,	// arc width
			30	// arc height
		);
		// Texte01
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"MOTEUR 1",	// text
			40 + _dx,	// x
			0 + _dy,	// y
			220,	// width
			60,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F56	// font type
		);
		// Texte02
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"MOTEUR 2",	// text
			40 + _dx,	// x
			260 + _dy,	// y
			200,	// width
			60,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F56	// font type
		);
		// Texte03
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"MOTEUR 3",	// text
			400 + _dx,	// x
			0 + _dy,	// y
			180,	// width
			60,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F56	// font type
		);
		// Texte04
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"MOTEUR 4",	// text
			400 + _dx,	// x
			260 + _dy,	// y
			180,	// width
			60,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F56	// font type
		);
		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
