package com.bytedance.adsdk.oq.csi;

import android.graphics.Rect;
import android.util.JsonReader;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class uml {
    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    private static JSONArray bob(JsonReader jsonReader) {
        byte b10;
        JSONArray jSONArray = new JSONArray();
        try {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                JSONObject jSONObject = new JSONObject();
                jSONArray.put(jSONObject);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != 3324) {
                        if (iHashCode == 116753 && strNextName.equals("vid")) {
                            b10 = 0;
                        } else {
                            b10 = -1;
                        }
                    } else if (strNextName.equals("hd")) {
                        b10 = 1;
                    } else {
                        b10 = -1;
                    }
                    if (b10 == 0) {
                        jSONObject.put("vid", jsonReader.nextString());
                    } else if (b10 != 1) {
                        jsonReader.skipValue();
                    } else {
                        try {
                            jSONObject.put("hd", jsonReader.nextInt());
                        } catch (JSONException unused) {
                        }
                    }
                }
                jsonReader.endObject();
            }
            jsonReader.endArray();
        } catch (Exception unused2) {
        }
        return jSONArray;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0085  */
    private static List<com.bytedance.adsdk.oq.nn.kq> fou(JsonReader jsonReader) {
        try {
            ArrayList arrayList = new ArrayList();
            while (jsonReader.hasNext()) {
                com.bytedance.adsdk.oq.nn.kq kqVar = new com.bytedance.adsdk.oq.nn.kq();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    switch (jsonReader.nextName()) {
                        case "l":
                            kqVar.kq = jsonReader.nextInt();
                            break;
                        case "le":
                            kqVar.oq = jsonReader.nextInt();
                            break;
                        case "s":
                            kqVar.csi = jsonReader.nextInt();
                            break;
                        case "c":
                            kqVar.bob = jsonReader.nextString();
                            break;
                        case "f":
                            kqVar.fou = jsonReader.nextString();
                            break;
                        case "bs":
                            kqVar.rhi = jsonReader.nextInt();
                            break;
                        case "ali":
                            kqVar.rjo = jsonReader.nextString();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                arrayList.add(kqVar);
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    public static com.bytedance.adsdk.oq.rjo kq(JsonReader jsonReader) throws IOException {
        float f10;
        float fKq = com.bytedance.adsdk.oq.rhi.rhi.kq();
        LongSparseArray<com.bytedance.adsdk.oq.bob.bob.csi> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        SparseArray<com.bytedance.adsdk.oq.bob.fou> sparseArray = new SparseArray<>();
        com.bytedance.adsdk.oq.rjo.bob bobVar = new com.bytedance.adsdk.oq.rjo.bob();
        com.bytedance.adsdk.oq.rjo.kq kqVar = new com.bytedance.adsdk.oq.rjo.kq();
        com.bytedance.adsdk.oq.rjo.oq oqVar = new com.bytedance.adsdk.oq.rjo.oq();
        com.bytedance.adsdk.oq.rjo rjoVar = new com.bytedance.adsdk.oq.rjo();
        jsonReader.beginObject();
        float fNextDouble = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float fNextDouble2 = 0.0f;
        String strNextString = null;
        int iNextInt = 0;
        int iNextInt2 = 0;
        float fNextDouble3 = 0.0f;
        while (jsonReader.hasNext()) {
            float f11 = fNextDouble;
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            byte b10 = -1;
            switch (strNextName.hashCode()) {
                case -1408207997:
                    f10 = fNextDouble3;
                    if (strNextName.equals("assets")) {
                        b10 = 0;
                    }
                    break;
                case -1109732030:
                    f10 = fNextDouble3;
                    if (strNextName.equals("layers")) {
                        b10 = 1;
                    }
                    break;
                case -865448777:
                    f10 = fNextDouble3;
                    if (strNextName.equals("globalEvent")) {
                        b10 = 2;
                    }
                    break;
                case 104:
                    f10 = fNextDouble3;
                    if (strNextName.equals("h")) {
                        b10 = 3;
                    }
                    break;
                case 118:
                    f10 = fNextDouble3;
                    if (strNextName.equals("v")) {
                        b10 = 4;
                    }
                    break;
                case 119:
                    f10 = fNextDouble3;
                    if (strNextName.equals("w")) {
                        b10 = 5;
                    }
                    break;
                case 3208:
                    f10 = fNextDouble3;
                    if (strNextName.equals("dl")) {
                        b10 = 6;
                    }
                    break;
                case 3276:
                    f10 = fNextDouble3;
                    if (strNextName.equals("fr")) {
                        b10 = 7;
                    }
                    break;
                case 3292:
                    f10 = fNextDouble3;
                    if (strNextName.equals("gc")) {
                        b10 = 8;
                    }
                    break;
                case 3367:
                    f10 = fNextDouble3;
                    if (strNextName.equals("ip")) {
                        b10 = 9;
                    }
                    break;
                case 3553:
                    f10 = fNextDouble3;
                    if (strNextName.equals("op")) {
                        b10 = 10;
                    }
                    break;
                case 94623709:
                    f10 = fNextDouble3;
                    if (strNextName.equals("chars")) {
                        b10 = 11;
                    }
                    break;
                case 97615364:
                    f10 = fNextDouble3;
                    if (strNextName.equals("fonts")) {
                        b10 = 12;
                    }
                    break;
                case 110364485:
                    f10 = fNextDouble3;
                    if (strNextName.equals("timer")) {
                        b10 = 13;
                    }
                    break;
                case 839250809:
                    f10 = fNextDouble3;
                    if (strNextName.equals("markers")) {
                        b10 = 14;
                    }
                    break;
                default:
                    f10 = fNextDouble3;
                    break;
            }
            switch (b10) {
                case 0:
                    kq(jsonReader, rjoVar, map, map2);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 1:
                    kq(jsonReader, rjoVar, arrayList, longSparseArray);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 2:
                    kq(jsonReader, oqVar);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 3:
                    iNextInt = jsonReader.nextInt();
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 4:
                    String[] strArrSplit = jsonReader.nextString().split("\\.");
                    if (!com.bytedance.adsdk.oq.rhi.rhi.kq(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        rjoVar.kq("Lottie only supports bodymovin >= 4.4.0");
                    }
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 5:
                    iNextInt2 = jsonReader.nextInt();
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 6:
                    strNextString = jsonReader.nextString();
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 7:
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 8:
                    kq(jsonReader, kqVar);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 9:
                    fNextDouble = (float) jsonReader.nextDouble();
                    fNextDouble3 = f10;
                    break;
                case 10:
                    fNextDouble3 = ((float) jsonReader.nextDouble()) - 0.01f;
                    fNextDouble = f11;
                    break;
                case 11:
                    kq(jsonReader, rjoVar, sparseArray);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 12:
                    kq(jsonReader, map3);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 13:
                    kq(jsonReader, bobVar);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 14:
                    kq(jsonReader, arrayList2);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                default:
                    jsonReader.skipValue();
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
            }
        }
        jsonReader.endObject();
        rjoVar.kq(new Rect(0, 0, (int) (iNextInt2 * fKq), (int) (iNextInt * fKq)), fNextDouble, fNextDouble3, fNextDouble2, arrayList, longSparseArray, map, map2, sparseArray, map3, arrayList2, bobVar, strNextString, kqVar, oqVar);
        return rjoVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    private static void oq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo.kq kqVar) {
        byte b10;
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3239) {
                    if (iHashCode != 3276) {
                        if (iHashCode == 107027 && strNextName.equals("lel")) {
                            b10 = 2;
                        } else {
                            b10 = -1;
                        }
                    } else if (strNextName.equals("fr")) {
                        b10 = 0;
                    } else {
                        b10 = -1;
                    }
                } else if (strNextName.equals("el")) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
                if (b10 == 0) {
                    kqVar.csi = jsonReader.nextInt();
                } else if (b10 == 1) {
                    kqVar.rhi = jsonReader.nextString();
                } else if (b10 != 2) {
                    jsonReader.skipValue();
                } else {
                    kqVar.rjo = bob(jsonReader);
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
        }
    }

    private static Map<String, Object> oq(JsonReader jsonReader) throws IOException {
        HashMap map = new HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("lel")) {
                map.put("lel", bob(jsonReader));
            } else if (!strNextName.equals("lottie_back")) {
                jsonReader.skipValue();
            } else {
                JSONObject jSONObject = new JSONObject();
                map.put("lottie_back", jSONObject);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.getClass();
                    if (!strNextName2.equals("hd")) {
                        jsonReader.skipValue();
                    } else {
                        try {
                            jSONObject.putOpt("hd", Integer.valueOf(jsonReader.nextInt()));
                            jSONObject.putOpt("vid", "lottie_back");
                        } catch (JSONException unused) {
                        }
                    }
                }
                jsonReader.endObject();
            }
        }
        jsonReader.endObject();
        Object objRemove = map.remove("lottie_back");
        if (objRemove instanceof JSONObject) {
            Object obj = map.get("lel");
            if (obj instanceof JSONArray) {
                ((JSONArray) obj).put(objRemove);
            } else {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(objRemove);
                map.put("lel", jSONArray);
            }
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    private static void kq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo.oq oqVar) {
        byte b10;
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3239) {
                    if (iHashCode != 107027) {
                        if (iHashCode == 3237004 && strNextName.equals("inel")) {
                            b10 = 0;
                        } else {
                            b10 = -1;
                        }
                    } else if (strNextName.equals("lel")) {
                        b10 = 2;
                    } else {
                        b10 = -1;
                    }
                } else if (strNextName.equals("el")) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
                if (b10 == 0) {
                    oqVar.oq = new int[][]{new int[]{-1, -1}};
                    jsonReader.beginArray();
                    if (jsonReader.hasNext()) {
                        jsonReader.beginArray();
                        for (int i10 = 0; i10 < 2; i10++) {
                            if (jsonReader.hasNext()) {
                                oqVar.oq[0][i10] = jsonReader.nextInt();
                            }
                        }
                        jsonReader.endArray();
                    }
                    jsonReader.endArray();
                } else if (b10 == 1) {
                    oqVar.kq = jsonReader.nextString();
                } else if (b10 != 2) {
                    jsonReader.skipValue();
                } else {
                    oqVar.bob = bob(jsonReader);
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    private static void kq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo.kq kqVar) {
        byte b10;
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3139) {
                    if (iHashCode != 3232) {
                        if (iHashCode != 3571) {
                            if (iHashCode != 3666) {
                                if (iHashCode == 98713 && strNextName.equals("cpf")) {
                                    b10 = 4;
                                } else {
                                    b10 = -1;
                                }
                            } else if (strNextName.equals("se")) {
                                b10 = 0;
                            } else {
                                b10 = -1;
                            }
                        } else if (strNextName.equals("pc")) {
                            b10 = 3;
                        } else {
                            b10 = -1;
                        }
                    } else if (strNextName.equals("ee")) {
                        b10 = 2;
                    } else {
                        b10 = -1;
                    }
                } else if (strNextName.equals("be")) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
                if (b10 == 0) {
                    kqVar.kq = jsonReader.nextInt();
                } else if (b10 == 1) {
                    kqVar.oq = oq(jsonReader);
                } else if (b10 == 2) {
                    kqVar.bob = oq(jsonReader);
                } else if (b10 == 3) {
                    kqVar.fou = jsonReader.nextInt();
                } else if (b10 != 4) {
                    jsonReader.skipValue();
                } else {
                    oq(jsonReader, kqVar);
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    private static void kq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo.bob bobVar) {
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                switch (jsonReader.nextName()) {
                    case "ke":
                        bobVar.kq = jsonReader.nextInt();
                        break;
                    case "id":
                        bobVar.oq = jsonReader.nextString();
                        break;
                    case "tl":
                        bobVar.bob = jsonReader.nextString();
                        break;
                    case "at":
                        bobVar.fou = jsonReader.nextString();
                        break;
                    case "inel":
                        bobVar.csi = new int[]{-1, -1};
                        jsonReader.beginArray();
                        for (int i10 = 0; i10 < 2; i10++) {
                            if (jsonReader.hasNext()) {
                                bobVar.csi[i10] = jsonReader.nextInt();
                            }
                        }
                        jsonReader.endArray();
                        break;
                    case "el":
                        bobVar.rhi = jsonReader.nextString();
                        break;
                    case "lel":
                        bobVar.rjo = bob(jsonReader);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    private static void kq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar, List<com.bytedance.adsdk.oq.bob.bob.csi> list, LongSparseArray<com.bytedance.adsdk.oq.bob.bob.csi> longSparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.oq.bob.bob.csi csiVarKq = jhe.kq(jsonReader, rjoVar);
            csiVarKq.ubx();
            com.bytedance.adsdk.oq.bob.bob.csi.kq kqVar = com.bytedance.adsdk.oq.bob.bob.csi.kq.PRE_COMP;
            list.add(csiVarKq);
            longSparseArray.put(csiVarKq.csi(), csiVarKq);
        }
        jsonReader.endArray();
    }

    private static void kq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar, Map<String, List<com.bytedance.adsdk.oq.bob.bob.csi>> map, Map<String, com.bytedance.adsdk.oq.nn> map2) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            jsonReader.beginObject();
            String strNextString = null;
            String strNextString2 = null;
            String strNextString3 = null;
            String strNextString4 = null;
            List<com.bytedance.adsdk.oq.nn.kq> listFou = null;
            String strNextString5 = null;
            int[][] iArr = null;
            JSONArray jSONArrayBob = null;
            int iNextInt = 0;
            int iNextInt2 = 0;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "layers":
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            com.bytedance.adsdk.oq.bob.bob.csi csiVarKq = jhe.kq(jsonReader, rjoVar);
                            longSparseArray.put(csiVarKq.csi(), csiVarKq);
                            arrayList.add(csiVarKq);
                        }
                        jsonReader.endArray();
                        break;
                    case "h":
                        iNextInt2 = jsonReader.nextInt();
                        break;
                    case "p":
                        strNextString2 = jsonReader.nextString();
                        break;
                    case "u":
                        strNextString3 = jsonReader.nextString();
                        break;
                    case "w":
                        iNextInt = jsonReader.nextInt();
                        break;
                    case "el":
                        strNextString5 = jsonReader.nextString();
                        break;
                    case "id":
                        strNextString = jsonReader.nextString();
                        break;
                    case "tc":
                        jsonReader.beginArray();
                        listFou = fou(jsonReader);
                        jsonReader.endArray();
                        break;
                    case "lel":
                        jSONArrayBob = bob(jsonReader);
                        break;
                    case "rel":
                        strNextString4 = jsonReader.nextString();
                        break;
                    case "inel":
                        iArr = new int[][]{new int[]{-1, -1}};
                        jsonReader.beginArray();
                        if (jsonReader.hasNext()) {
                            jsonReader.beginArray();
                            for (int i10 = 0; i10 < 2; i10++) {
                                if (jsonReader.hasNext()) {
                                    iArr[0][i10] = jsonReader.nextInt();
                                }
                            }
                            jsonReader.endArray();
                        }
                        jsonReader.endArray();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            if (strNextString2 != null) {
                com.bytedance.adsdk.oq.nn nnVar = new com.bytedance.adsdk.oq.nn(iNextInt, iNextInt2, strNextString, strNextString2, strNextString3, strNextString4, listFou, strNextString5, iArr, jSONArrayBob);
                map2.put(nnVar.syt(), nnVar);
            } else {
                map.put(strNextString, arrayList);
            }
        }
        jsonReader.endArray();
    }

    private static void kq(JsonReader jsonReader, Map<String, com.bytedance.adsdk.oq.bob.bob> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("list")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.oq.bob.bob bobVarKq = suf.kq(jsonReader);
                    map.put(bobVarKq.oq(), bobVarKq);
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
    }

    private static void kq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar, SparseArray<com.bytedance.adsdk.oq.bob.fou> sparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.oq.bob.fou fouVarKq = wki.kq(jsonReader, rjoVar);
            sparseArray.put(fouVarKq.hashCode(), fouVarKq);
        }
        jsonReader.endArray();
    }

    private static void kq(JsonReader jsonReader, List<com.bytedance.adsdk.oq.bob.rhi> list) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            float fNextDouble = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            String strNextString = null;
            float fNextDouble2 = 0.0f;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "cm":
                        strNextString = jsonReader.nextString();
                        break;
                    case "dr":
                        fNextDouble2 = (float) jsonReader.nextDouble();
                        break;
                    case "tm":
                        fNextDouble = (float) jsonReader.nextDouble();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            list.add(new com.bytedance.adsdk.oq.bob.rhi(strNextString, fNextDouble, fNextDouble2));
        }
        jsonReader.endArray();
    }
}
