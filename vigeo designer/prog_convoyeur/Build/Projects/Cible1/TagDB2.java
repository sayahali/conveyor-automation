package Projects.Cible1;

import gpclasses.baseclasses.*;
import gpclasses.system.*;
import gpclasses.tags.*;
import gpclasses.trends.*;
import gpclasses.macroobjects.*;

public class TagDB2
{
	public static Object classFactory3(int tagFieldIdentifier)
	{
		TagDB.PLC_EquipementModbus01.ARRET = new CgpDiscreteTag("PLC_EquipementModbus01.ARRET", 1, TagDB.startNumber + 0, true, false, true);

		TagDB.PLC_EquipementModbus01.ARRET_MOT = new CgpDiscreteTag("PLC_EquipementModbus01.ARRET_MOT", 1, TagDB.startNumber + 1, true, false, true);

		TagDB.PLC_EquipementModbus01.bp_active = new CgpDiscreteTag("PLC_EquipementModbus01.bp_active", 1, TagDB.startNumber + 2, true, false, true);

		TagDB.PLC_EquipementModbus01.BP_M1_S1 = new CgpDiscreteTag("PLC_EquipementModbus01.BP_M1_S1", 1, TagDB.startNumber + 3, true, false, true);

		TagDB.PLC_EquipementModbus01.BP_M1_S2 = new CgpDiscreteTag("PLC_EquipementModbus01.BP_M1_S2", 1, TagDB.startNumber + 4, true, false, true);

		TagDB.PLC_EquipementModbus01.BP_M2_S1 = new CgpDiscreteTag("PLC_EquipementModbus01.BP_M2_S1", 1, TagDB.startNumber + 5, true, false, true);

		TagDB.PLC_EquipementModbus01.BP_M2_S2 = new CgpDiscreteTag("PLC_EquipementModbus01.BP_M2_S2", 1, TagDB.startNumber + 6, true, false, true);

		TagDB.PLC_EquipementModbus01.BP_M3_S1 = new CgpDiscreteTag("PLC_EquipementModbus01.BP_M3_S1", 1, TagDB.startNumber + 7, true, false, true);

		TagDB.PLC_EquipementModbus01.BP_M3_S2 = new CgpDiscreteTag("PLC_EquipementModbus01.BP_M3_S2", 1, TagDB.startNumber + 8, true, false, true);

		TagDB.PLC_EquipementModbus01.BP_M4_S1 = new CgpDiscreteTag("PLC_EquipementModbus01.BP_M4_S1", 1, TagDB.startNumber + 9, true, false, true);

		TagDB.PLC_EquipementModbus01.BP_M4_S2 = new CgpDiscreteTag("PLC_EquipementModbus01.BP_M4_S2", 1, TagDB.startNumber + 10, true, false, true);

		TagDB.PLC_EquipementModbus01.capteur_2 = new CgpDiscreteTag("PLC_EquipementModbus01.capteur_2", 1, TagDB.startNumber + 11, true, false, true);

		TagDB.PLC_EquipementModbus01.capteur_3 = new CgpDiscreteTag("PLC_EquipementModbus01.capteur_3", 1, TagDB.startNumber + 12, true, false, true);

		TagDB.PLC_EquipementModbus01.capteur_4 = new CgpDiscreteTag("PLC_EquipementModbus01.capteur_4", 1, TagDB.startNumber + 13, true, false, true);

		TagDB.PLC_EquipementModbus01.capteur_5 = new CgpDiscreteTag("PLC_EquipementModbus01.capteur_5", 1, TagDB.startNumber + 14, true, false, true);

		TagDB.PLC_EquipementModbus01.capteur_6 = new CgpDiscreteTag("PLC_EquipementModbus01.capteur_6", 1, TagDB.startNumber + 15, true, false, true);

		TagDB.PLC_EquipementModbus01.capteur_entrepot = new CgpDiscreteTag("PLC_EquipementModbus01.capteur_entrepot", 1, TagDB.startNumber + 16, true, false, true);

		TagDB.PLC_EquipementModbus01.capteur_livraison = new CgpDiscreteTag("PLC_EquipementModbus01.capteur_livraison", 1, TagDB.startNumber + 17, true, false, true);

		TagDB.PLC_EquipementModbus01.M1_S1 = new CgpDiscreteTag("PLC_EquipementModbus01.M1_S1", 1, TagDB.startNumber + 18, true, false, true);

		TagDB.PLC_EquipementModbus01.M1_S2 = new CgpDiscreteTag("PLC_EquipementModbus01.M1_S2", 1, TagDB.startNumber + 19, true, false, true);

		TagDB.PLC_EquipementModbus01.M2_S1 = new CgpDiscreteTag("PLC_EquipementModbus01.M2_S1", 1, TagDB.startNumber + 20, true, false, true);

		TagDB.PLC_EquipementModbus01.M2_S2 = new CgpDiscreteTag("PLC_EquipementModbus01.M2_S2", 1, TagDB.startNumber + 21, true, false, true);

		TagDB.PLC_EquipementModbus01.M3_S1 = new CgpDiscreteTag("PLC_EquipementModbus01.M3_S1", 1, TagDB.startNumber + 22, true, false, true);

		TagDB.PLC_EquipementModbus01.M3_S2 = new CgpDiscreteTag("PLC_EquipementModbus01.M3_S2", 1, TagDB.startNumber + 23, true, false, true);

		TagDB.PLC_EquipementModbus01.M4_S1 = new CgpDiscreteTag("PLC_EquipementModbus01.M4_S1", 1, TagDB.startNumber + 24, true, false, true);

		TagDB.PLC_EquipementModbus01.M4_S2 = new CgpDiscreteTag("PLC_EquipementModbus01.M4_S2", 1, TagDB.startNumber + 25, true, false, true);

		TagDB.PLC_EquipementModbus01.mode_auto = new CgpDiscreteTag("PLC_EquipementModbus01.mode_auto", 1, TagDB.startNumber + 26, true, false, true);

		TagDB.PLC_EquipementModbus01.Mode_manuel = new CgpDiscreteTag("PLC_EquipementModbus01.Mode_manuel", 1, TagDB.startNumber + 27, true, false, true);

		TagDB.PLC_EquipementModbus01.selec_auto = new CgpDiscreteTag("PLC_EquipementModbus01.selec_auto", 1, TagDB.startNumber + 28, true, false, true);

		TagDB.PLC_EquipementModbus01.selec_man = new CgpDiscreteTag("PLC_EquipementModbus01.selec_man", 1, TagDB.startNumber + 29, true, false, true);


		new RefTagDB();

		return null;
	}
}
