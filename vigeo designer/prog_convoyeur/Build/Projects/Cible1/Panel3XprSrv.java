package Projects.Cible1;

import gpclasses.baseclasses.*;
import gpclasses.system.*;
import java.lang.System;
import gpclasses.plugins.script.*;
import java.util.Date;
import gpclasses.plugins.diag.*;
import gpclasses.util.misc.*;
import gpclasses.userScripts.*;
import gpclasses.util.io.*;

public class Panel3XprSrv extends CgpExpressionServer
{
	public int executeIntExpression(int i)
	{
		switch (i)
		{
			case 1000:
			case 1002:
				{
					quality = TagDB.PLC_EquipementModbus01.M1_S1.getTagDataQuality();
					if ((TagDB.PLC_EquipementModbus01.M1_S1.getIntValue(0) != 0))
						return 1;
					else
						return 0;
				}
			case 1001:
				{
					quality = TagDB.PLC_EquipementModbus01.M2_S1.getTagDataQuality();
					if ((TagDB.PLC_EquipementModbus01.M2_S1.getIntValue(0) != 0))
						return 1;
					else
						return 0;
				}
			case 1003:
			case 1005:
				{
					quality = TagDB.PLC_EquipementModbus01.M3_S1.getTagDataQuality();
					if ((TagDB.PLC_EquipementModbus01.M3_S1.getIntValue(0) != 0))
						return 1;
					else
						return 0;
				}
			case 1004:
				{
					quality = TagDB.PLC_EquipementModbus01.M4_S1.getTagDataQuality();
					if ((TagDB.PLC_EquipementModbus01.M4_S1.getIntValue(0) != 0))
						return 1;
					else
						return 0;
				}
		}
		return 0;
	}

}
