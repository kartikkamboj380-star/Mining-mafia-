package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import com.appsflyer.AdRevenueScheme;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.ConnectionResult;
import com.google.protobuf.DescriptorProtos;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3502fb0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C1742Fs f28361A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final List f28362A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final String f28363B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final boolean f28364B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final JSONObject f28365C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final List f28366C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final JSONObject f28367D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final boolean f28368D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final String f28369E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public final int f28370E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final String f28371F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public final Bundle f28372F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final String f28373G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public final boolean f28374G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final String f28375H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public final int f28376H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final String f28377I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final boolean f28378J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final boolean f28379K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final boolean f28380L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final boolean f28381M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final boolean f28382N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final boolean f28383O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final boolean f28384P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final int f28385Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final int f28386R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final boolean f28387S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final boolean f28388T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final String f28389U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final C1553Cb0 f28390V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final boolean f28391W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final boolean f28392X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f28393Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final String f28394Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f28395a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final int f28396a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28397b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final String f28398b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f28399c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final boolean f28400c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f28401d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final C5670wq f28402d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f28403e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final H4.o2 f28404e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f28405f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final String f28406f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f28407g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final boolean f28408g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f28409h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final JSONObject f28410h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f28411i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final boolean f28412i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f28413j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final JSONObject f28414j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f28415k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final boolean f28416k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C2519Ur f28417l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final String f28418l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f28419m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final boolean f28420m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f28421n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final String f28422n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f28423o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final String f28424o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f28425p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f28426p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f28427q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f28428q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f28429r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f28430r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C4130kb0 f28431s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f28432s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f28433t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f28434t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final List f28435u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final List f28436u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final JSONObject f28437v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final boolean f28438v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f28439w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Map f28440w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f28441x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final L4.w f28442x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f28443y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final L4.x f28444y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f28445z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final double f28446z0;

    /* JADX WARN: Code duplicated, block: B:276:0x0729 A[PHI: r93 r95
      0x0729: PHI (r93v96 java.util.List) = 
      (r93v4 java.util.List)
      (r93v5 java.util.List)
      (r93v6 java.util.List)
      (r93v7 java.util.List)
      (r93v8 java.util.List)
      (r93v9 java.util.List)
      (r93v10 java.util.List)
      (r93v11 java.util.List)
      (r93v12 java.util.List)
      (r93v13 java.util.List)
      (r93v14 java.util.List)
      (r93v15 java.util.List)
      (r93v16 java.util.List)
      (r93v17 java.util.List)
      (r93v18 java.util.List)
      (r93v19 java.util.List)
      (r93v20 java.util.List)
      (r93v21 java.util.List)
      (r93v22 java.util.List)
      (r93v23 java.util.List)
      (r93v24 java.util.List)
      (r93v25 java.util.List)
      (r93v26 java.util.List)
      (r93v27 java.util.List)
      (r93v28 java.util.List)
      (r93v29 java.util.List)
      (r93v30 java.util.List)
      (r93v31 java.util.List)
      (r93v32 java.util.List)
      (r93v33 java.util.List)
      (r93v34 java.util.List)
      (r93v35 java.util.List)
      (r93v36 java.util.List)
      (r93v37 java.util.List)
      (r93v38 java.util.List)
      (r93v39 java.util.List)
      (r93v40 java.util.List)
      (r93v41 java.util.List)
      (r93v42 java.util.List)
      (r93v43 java.util.List)
      (r93v44 java.util.List)
      (r93v45 java.util.List)
      (r93v46 java.util.List)
      (r93v47 java.util.List)
      (r93v48 java.util.List)
      (r93v49 java.util.List)
      (r93v50 java.util.List)
      (r93v51 java.util.List)
      (r93v52 java.util.List)
      (r93v53 java.util.List)
      (r93v54 java.util.List)
      (r93v55 java.util.List)
      (r93v56 java.util.List)
      (r93v57 java.util.List)
      (r93v58 java.util.List)
      (r93v59 java.util.List)
      (r93v60 java.util.List)
      (r93v61 java.util.List)
      (r93v62 java.util.List)
      (r93v63 java.util.List)
      (r93v64 java.util.List)
      (r93v65 java.util.List)
      (r93v66 java.util.List)
      (r93v67 java.util.List)
      (r93v68 java.util.List)
      (r93v69 java.util.List)
      (r93v70 java.util.List)
      (r93v71 java.util.List)
      (r93v72 java.util.List)
      (r93v73 java.util.List)
      (r93v74 java.util.List)
      (r93v75 java.util.List)
      (r93v76 java.util.List)
      (r93v77 java.util.List)
      (r93v78 java.util.List)
      (r93v79 java.util.List)
      (r93v80 java.util.List)
      (r93v81 java.util.List)
      (r93v82 java.util.List)
      (r93v83 java.util.List)
      (r93v84 java.util.List)
      (r93v85 java.util.List)
      (r93v86 java.util.List)
      (r93v87 java.util.List)
      (r93v88 java.util.List)
      (r93v89 java.util.List)
      (r93v90 java.util.List)
      (r93v91 java.util.List)
      (r93v97 java.util.List)
     binds: [B:274:0x0724, B:271:0x0713, B:268:0x0702, B:265:0x06f1, B:262:0x06e0, B:259:0x06cf, B:256:0x06bd, B:253:0x06ab, B:250:0x0699, B:247:0x0687, B:244:0x0675, B:241:0x0663, B:238:0x0651, B:235:0x063f, B:232:0x062d, B:229:0x061b, B:226:0x0609, B:223:0x05f7, B:220:0x05e5, B:217:0x05d3, B:214:0x05c1, B:211:0x05af, B:208:0x059d, B:205:0x058b, B:202:0x0579, B:199:0x0567, B:196:0x0555, B:193:0x0543, B:190:0x0532, B:187:0x0520, B:184:0x050e, B:181:0x04fc, B:178:0x04ea, B:175:0x04d8, B:172:0x04c6, B:169:0x04b4, B:166:0x04a2, B:163:0x0490, B:160:0x047e, B:157:0x046c, B:154:0x045b, B:151:0x0449, B:148:0x0437, B:145:0x0425, B:142:0x0413, B:139:0x0401, B:136:0x03ef, B:133:0x03dd, B:130:0x03cb, B:127:0x03b9, B:124:0x03a7, B:121:0x0395, B:118:0x0383, B:115:0x0371, B:112:0x035f, B:109:0x034d, B:106:0x033b, B:103:0x032a, B:100:0x0318, B:97:0x0306, B:94:0x02f4, B:91:0x02e2, B:88:0x02d0, B:85:0x02be, B:82:0x02ac, B:79:0x029b, B:76:0x0289, B:73:0x0277, B:70:0x0265, B:67:0x0253, B:64:0x0241, B:61:0x022f, B:58:0x021d, B:55:0x020b, B:52:0x01f9, B:49:0x01e7, B:46:0x01d5, B:43:0x01c3, B:40:0x01b2, B:37:0x01a0, B:34:0x018f, B:31:0x017d, B:28:0x016c, B:25:0x015a, B:22:0x0148, B:19:0x0136, B:16:0x0124, B:13:0x0112, B:11:0x0100] A[DONT_GENERATE, DONT_INLINE]
      0x0729: PHI (r95v90 java.util.List) = 
      (r95v1 java.util.List)
      (r95v2 java.util.List)
      (r95v3 java.util.List)
      (r95v4 java.util.List)
      (r95v5 java.util.List)
      (r95v6 java.util.List)
      (r95v7 java.util.List)
      (r95v8 java.util.List)
      (r95v9 java.util.List)
      (r95v10 java.util.List)
      (r95v11 java.util.List)
      (r95v12 java.util.List)
      (r95v13 java.util.List)
      (r95v14 java.util.List)
      (r95v15 java.util.List)
      (r95v16 java.util.List)
      (r95v17 java.util.List)
      (r95v18 java.util.List)
      (r95v19 java.util.List)
      (r95v20 java.util.List)
      (r95v21 java.util.List)
      (r95v22 java.util.List)
      (r95v23 java.util.List)
      (r95v24 java.util.List)
      (r95v25 java.util.List)
      (r95v26 java.util.List)
      (r95v27 java.util.List)
      (r95v28 java.util.List)
      (r95v29 java.util.List)
      (r95v30 java.util.List)
      (r95v31 java.util.List)
      (r95v32 java.util.List)
      (r95v33 java.util.List)
      (r95v34 java.util.List)
      (r95v35 java.util.List)
      (r95v36 java.util.List)
      (r95v37 java.util.List)
      (r95v38 java.util.List)
      (r95v39 java.util.List)
      (r95v40 java.util.List)
      (r95v41 java.util.List)
      (r95v42 java.util.List)
      (r95v43 java.util.List)
      (r95v44 java.util.List)
      (r95v45 java.util.List)
      (r95v46 java.util.List)
      (r95v47 java.util.List)
      (r95v48 java.util.List)
      (r95v49 java.util.List)
      (r95v50 java.util.List)
      (r95v51 java.util.List)
      (r95v52 java.util.List)
      (r95v53 java.util.List)
      (r95v54 java.util.List)
      (r95v55 java.util.List)
      (r95v56 java.util.List)
      (r95v57 java.util.List)
      (r95v58 java.util.List)
      (r95v59 java.util.List)
      (r95v60 java.util.List)
      (r95v61 java.util.List)
      (r95v62 java.util.List)
      (r95v63 java.util.List)
      (r95v64 java.util.List)
      (r95v65 java.util.List)
      (r95v66 java.util.List)
      (r95v67 java.util.List)
      (r95v68 java.util.List)
      (r95v69 java.util.List)
      (r95v70 java.util.List)
      (r95v71 java.util.List)
      (r95v72 java.util.List)
      (r95v73 java.util.List)
      (r95v74 java.util.List)
      (r95v75 java.util.List)
      (r95v76 java.util.List)
      (r95v77 java.util.List)
      (r95v78 java.util.List)
      (r95v79 java.util.List)
      (r95v80 java.util.List)
      (r95v81 java.util.List)
      (r95v82 java.util.List)
      (r95v83 java.util.List)
      (r95v84 java.util.List)
      (r95v85 java.util.List)
      (r95v86 java.util.List)
      (r95v87 java.util.List)
      (r95v88 java.util.List)
      (r95v91 java.util.List)
     binds: [B:274:0x0724, B:271:0x0713, B:268:0x0702, B:265:0x06f1, B:262:0x06e0, B:259:0x06cf, B:256:0x06bd, B:253:0x06ab, B:250:0x0699, B:247:0x0687, B:244:0x0675, B:241:0x0663, B:238:0x0651, B:235:0x063f, B:232:0x062d, B:229:0x061b, B:226:0x0609, B:223:0x05f7, B:220:0x05e5, B:217:0x05d3, B:214:0x05c1, B:211:0x05af, B:208:0x059d, B:205:0x058b, B:202:0x0579, B:199:0x0567, B:196:0x0555, B:193:0x0543, B:190:0x0532, B:187:0x0520, B:184:0x050e, B:181:0x04fc, B:178:0x04ea, B:175:0x04d8, B:172:0x04c6, B:169:0x04b4, B:166:0x04a2, B:163:0x0490, B:160:0x047e, B:157:0x046c, B:154:0x045b, B:151:0x0449, B:148:0x0437, B:145:0x0425, B:142:0x0413, B:139:0x0401, B:136:0x03ef, B:133:0x03dd, B:130:0x03cb, B:127:0x03b9, B:124:0x03a7, B:121:0x0395, B:118:0x0383, B:115:0x0371, B:112:0x035f, B:109:0x034d, B:106:0x033b, B:103:0x032a, B:100:0x0318, B:97:0x0306, B:94:0x02f4, B:91:0x02e2, B:88:0x02d0, B:85:0x02be, B:82:0x02ac, B:79:0x029b, B:76:0x0289, B:73:0x0277, B:70:0x0265, B:67:0x0253, B:64:0x0241, B:61:0x022f, B:58:0x021d, B:55:0x020b, B:52:0x01f9, B:49:0x01e7, B:46:0x01d5, B:43:0x01c3, B:40:0x01b2, B:37:0x01a0, B:34:0x018f, B:31:0x017d, B:28:0x016c, B:25:0x015a, B:22:0x0148, B:19:0x0136, B:16:0x0124, B:13:0x0112, B:11:0x0100] A[DONT_GENERATE, DONT_INLINE]] */
    C3502fb0(JsonReader jsonReader) throws IOException {
        List list;
        List listB;
        byte b10;
        List listB2 = Collections.EMPTY_LIST;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        AbstractC5931yu0.l();
        AbstractC5931yu0 abstractC5931yu0L = AbstractC5931yu0.l();
        HashMap map = new HashMap();
        AbstractC5931yu0 abstractC5931yu0L2 = AbstractC5931yu0.l();
        AbstractC5931yu0 abstractC5931yu0L3 = AbstractC5931yu0.l();
        Bundle bundle = new Bundle();
        jsonReader.beginObject();
        List listA = listB2;
        List listB3 = listA;
        List listA2 = listB3;
        List listB4 = listA2;
        JSONObject jSONObjectD = jSONObject;
        JSONObject jSONObjectD2 = jSONObject2;
        JSONObject jSONObjectD3 = jSONObject3;
        JSONObject jSONObjectD4 = jSONObject4;
        JSONObject jSONObjectD5 = jSONObject5;
        JSONObject jSONObjectD6 = jSONObject6;
        List listB5 = abstractC5931yu0L;
        Map mapC = map;
        List listB6 = abstractC5931yu0L2;
        AbstractC5931yu0 abstractC5931yu0A = abstractC5931yu0L3;
        Bundle bundle2 = bundle;
        int iA = 2;
        double dNextDouble = 0.0d;
        C2519Ur c2519UrA = null;
        C1742Fs c1742FsA = null;
        C5670wq c5670wqA = null;
        H4.o2 o2VarA = null;
        String strNextString = null;
        L4.w wVarB = null;
        L4.x xVarD = null;
        C4130kb0 c4130kb0 = null;
        String strNextString2 = "";
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String strNextString5 = strNextString4;
        String strNextString6 = strNextString5;
        String string = strNextString6;
        String strNextString7 = string;
        String strNextString8 = strNextString7;
        String strNextString9 = strNextString8;
        String strNextString10 = strNextString9;
        String strNextString11 = strNextString10;
        String strNextString12 = strNextString11;
        String strNextString13 = strNextString12;
        String strNextString14 = strNextString13;
        String strNextString15 = strNextString14;
        String strNextString16 = strNextString15;
        String strNextString17 = strNextString16;
        String strNextString18 = strNextString17;
        String strNextString19 = strNextString18;
        String strNextString20 = strNextString19;
        int iC = 0;
        int iD = 0;
        int iNextInt = 0;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        boolean zNextBoolean3 = false;
        boolean zNextBoolean4 = false;
        boolean zNextBoolean5 = false;
        boolean zNextBoolean6 = false;
        boolean zNextBoolean7 = false;
        int iE = -1;
        int iNextInt2 = 0;
        boolean zNextBoolean8 = false;
        boolean zNextBoolean9 = false;
        boolean zNextBoolean10 = false;
        int iNextInt3 = 0;
        int iNextInt4 = -1;
        boolean zNextBoolean11 = false;
        boolean zNextBoolean12 = false;
        boolean zNextBoolean13 = false;
        boolean zNextBoolean14 = false;
        boolean zNextBoolean15 = false;
        boolean zNextBoolean16 = false;
        boolean zNextBoolean17 = false;
        boolean zNextBoolean18 = false;
        int iNextInt5 = 0;
        boolean zNextBoolean19 = false;
        boolean zNextBoolean20 = false;
        boolean zNextBoolean21 = false;
        int iNextInt6 = -1;
        boolean zNextBoolean22 = true;
        List listB7 = listB4;
        List listB8 = listB7;
        List listB9 = listB8;
        List listB10 = listB9;
        List listB11 = listB10;
        List listB12 = listB11;
        List listB13 = listB12;
        List listB14 = listB13;
        List list2 = listB14;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            String str = strNextName == null ? "" : strNextName;
            switch (str.hashCode()) {
                case -2138196627:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("ad_source_instance_name")) {
                        b10 = -1;
                    } else {
                        b10 = 59;
                    }
                    break;
                case -1980587809:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("debug_signals")) {
                        b10 = -1;
                    } else {
                        b10 = 28;
                    }
                    break;
                case -1965512151:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("omid_settings")) {
                        b10 = -1;
                    } else {
                        b10 = 41;
                    }
                    break;
                case -1964744830:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("offline_ad_config")) {
                        b10 = -1;
                    } else {
                        b10 = 80;
                    }
                    break;
                case -1871425831:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("recursive_server_response_data")) {
                        b10 = -1;
                    } else {
                        b10 = 69;
                    }
                    break;
                case -1843156475:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("is_consent")) {
                        b10 = -1;
                    } else {
                        b10 = 71;
                    }
                    break;
                case -1840512279:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("presentation_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 82;
                    }
                    break;
                case -1828733410:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("network_ping_config")) {
                        b10 = -1;
                    } else {
                        b10 = 79;
                    }
                    break;
                case -1812055556:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("play_prewarm_options")) {
                        b10 = -1;
                    } else {
                        b10 = 49;
                    }
                    break;
                case -1785028569:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("parallel_key")) {
                        b10 = -1;
                    } else {
                        b10 = 73;
                    }
                    break;
                case -1776946669:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("ad_source_name")) {
                        b10 = -1;
                    } else {
                        b10 = 57;
                    }
                    break;
                case -1662989631:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("is_interscroller")) {
                        b10 = -1;
                    } else {
                        b10 = 53;
                    }
                    break;
                case -1620552059:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("preload_sort_type")) {
                        b10 = -1;
                    } else {
                        b10 = 77;
                    }
                    break;
                case -1620470467:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("backend_query_id")) {
                        b10 = -1;
                    } else {
                        b10 = 47;
                    }
                    break;
                case -1550155393:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("nofill_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 13;
                    }
                    break;
                case -1440104884:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("is_custom_close_blocked")) {
                        b10 = -1;
                    } else {
                        b10 = 35;
                    }
                    break;
                case -1439500848:
                    list = listB14;
                    listB = list2;
                    if (!str.equals(AdUnitActivity.EXTRA_ORIENTATION)) {
                        b10 = -1;
                    } else {
                        b10 = 37;
                    }
                    break;
                case -1428969291:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("enable_omid")) {
                        b10 = -1;
                    } else {
                        b10 = 39;
                    }
                    break;
                case -1406227629:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("buffer_click_url_as_ready_to_ping")) {
                        b10 = -1;
                    } else {
                        b10 = 67;
                    }
                    break;
                case -1403779768:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("showable_impression_type")) {
                        b10 = -1;
                    } else {
                        b10 = 44;
                    }
                    break;
                case -1375413093:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("ad_cover")) {
                        b10 = -1;
                    } else {
                        b10 = 54;
                    }
                    break;
                case -1360811658:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("ad_sizes")) {
                        b10 = -1;
                    } else {
                        b10 = 19;
                    }
                    break;
                case -1306015996:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("adapters")) {
                        b10 = -1;
                    } else {
                        b10 = 20;
                    }
                    break;
                case -1303332046:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("test_mode_enabled")) {
                        b10 = -1;
                    } else {
                        b10 = 34;
                    }
                    break;
                case -1289032093:
                    list = listB14;
                    listB = list2;
                    if (!str.equals(HandleInvocationsFromAdViewer.KEY_EXTRAS)) {
                        b10 = -1;
                    } else {
                        b10 = 29;
                    }
                    break;
                case -1240082064:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("ad_event_value")) {
                        b10 = -1;
                    } else {
                        b10 = 51;
                    }
                    break;
                case -1234181075:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("allow_pub_rendered_attribution")) {
                        b10 = -1;
                    } else {
                        b10 = 30;
                    }
                    break;
                case -1168140544:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("presentation_error_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 14;
                    }
                    break;
                case -1152230954:
                    list = listB14;
                    listB = list2;
                    if (!str.equals(AdRevenueScheme.AD_TYPE)) {
                        b10 = -1;
                    } else {
                        b10 = 1;
                    }
                    break;
                case -1146534047:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("is_scroll_aware")) {
                        b10 = -1;
                    } else {
                        b10 = 43;
                    }
                    break;
                case -1115838944:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("fill_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 12;
                    }
                    break;
                case -1081936678:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("allocation_id")) {
                        b10 = -1;
                    } else {
                        b10 = 21;
                    }
                    break;
                case -1078050970:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("video_complete_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 8;
                    }
                    break;
                case -1051269058:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("active_view")) {
                        b10 = -1;
                    } else {
                        b10 = 25;
                    }
                    break;
                case -982608540:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("valid_from_timestamp")) {
                        b10 = -1;
                    } else {
                        b10 = 10;
                    }
                    break;
                case -972056451:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("ad_source_instance_id")) {
                        b10 = -1;
                    } else {
                        b10 = 60;
                    }
                    break;
                case -776859333:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("click_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 2;
                    }
                    break;
                case -652881372:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("on_device_storage_configs")) {
                        b10 = -1;
                    } else {
                        b10 = 84;
                    }
                    break;
                case -570101180:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("late_load_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 74;
                    }
                    break;
                case -544216775:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("safe_browsing")) {
                        b10 = -1;
                    } else {
                        b10 = 26;
                    }
                    break;
                case -437057161:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("imp_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 3;
                    }
                    break;
                case -404433734:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("rtb_native_required_assets")) {
                        b10 = -1;
                    } else {
                        b10 = 62;
                    }
                    break;
                case -404326515:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("render_timeout_ms")) {
                        b10 = -1;
                    } else {
                        b10 = 38;
                    }
                    break;
                case -397704715:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("ad_close_time_ms")) {
                        b10 = -1;
                    } else {
                        b10 = 45;
                    }
                    break;
                case -388807511:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("content_url")) {
                        b10 = -1;
                    } else {
                        b10 = 64;
                    }
                    break;
                case -369773488:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("is_close_button_enabled")) {
                        b10 = -1;
                    } else {
                        b10 = 50;
                    }
                    break;
                case -213449460:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("force_disable_hardware_acceleration")) {
                        b10 = -1;
                    } else {
                        b10 = 65;
                    }
                    break;
                case -213424028:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("watermark")) {
                        b10 = -1;
                    } else {
                        b10 = 46;
                    }
                    break;
                case -180214626:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("native_required_asset_viewability")) {
                        b10 = -1;
                    } else {
                        b10 = 63;
                    }
                    break;
                case -154616268:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("is_offline_ad")) {
                        b10 = -1;
                    } else {
                        b10 = 61;
                    }
                    break;
                case -29338502:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("allow_custom_click_gesture")) {
                        b10 = -1;
                    } else {
                        b10 = 32;
                    }
                    break;
                case 3107:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("ad")) {
                        b10 = -1;
                    } else {
                        b10 = 18;
                    }
                    break;
                case 3355:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("id")) {
                        b10 = -1;
                    } else {
                        b10 = 23;
                    }
                    break;
                case 3076010:
                    list = listB14;
                    listB = list2;
                    if (!str.equals(JsonStorageKeyNames.DATA_KEY)) {
                        b10 = -1;
                    } else {
                        b10 = 22;
                    }
                    break;
                case 37109963:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("request_id")) {
                        b10 = -1;
                    } else {
                        b10 = 68;
                    }
                    break;
                case 63195984:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("render_test_label")) {
                        b10 = -1;
                    } else {
                        b10 = 33;
                    }
                    break;
                case 107433883:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("qdata")) {
                        b10 = -1;
                    } else {
                        b10 = 24;
                    }
                    break;
                case 230323073:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("ad_load_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 4;
                    }
                    break;
                case 281223176:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("is_secondary_analytics_logging_enabled")) {
                        b10 = -1;
                    } else {
                        b10 = 87;
                    }
                    break;
                case 418392395:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("is_closable_area_disabled")) {
                        b10 = -1;
                    } else {
                        b10 = 36;
                    }
                    break;
                case 542250332:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("consent_form_action_identifier")) {
                        b10 = -1;
                    } else {
                        b10 = 72;
                    }
                    break;
                case 549176928:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("presentation_error_timeout_ms")) {
                        b10 = -1;
                    } else {
                        b10 = 16;
                    }
                    break;
                case 597473788:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("debug_dialog_string")) {
                        b10 = -1;
                    } else {
                        b10 = 27;
                    }
                    break;
                case 639133141:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("response_info_extras_override")) {
                        b10 = -1;
                    } else {
                        b10 = 86;
                    }
                    break;
                case 754887508:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("container_sizes")) {
                        b10 = -1;
                    } else {
                        b10 = 17;
                    }
                    break;
                case 791122864:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("impression_type")) {
                        b10 = -1;
                    } else {
                        b10 = 5;
                    }
                    break;
                case 805095541:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("analytics_event_name_to_parameters_map")) {
                        b10 = -1;
                    } else {
                        b10 = 78;
                    }
                    break;
                case 1010584092:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("transaction_id")) {
                        b10 = -1;
                    } else {
                        b10 = 9;
                    }
                    break;
                case 1100650276:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("rewards")) {
                        b10 = -1;
                    } else {
                        b10 = 11;
                    }
                    break;
                case 1141602460:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("adapter_response_info_key")) {
                        b10 = -1;
                    } else {
                        b10 = 56;
                    }
                    break;
                case 1186014765:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("cache_hit_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 66;
                    }
                    break;
                case 1303622534:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("preload_sort_value")) {
                        b10 = -1;
                    } else {
                        b10 = 76;
                    }
                    break;
                case 1321720943:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("allow_pub_owned_ad_view")) {
                        b10 = -1;
                    } else {
                        b10 = 31;
                    }
                    break;
                case 1422388341:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("is_collapsible")) {
                        b10 = -1;
                    } else {
                        b10 = 70;
                    }
                    break;
                case 1437255331:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("ad_source_id")) {
                        b10 = -1;
                    } else {
                        b10 = 58;
                    }
                    break;
                case 1556932485:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("post_click_lifecycle_monitoring_duration_ms")) {
                        b10 = -1;
                    } else {
                        b10 = 81;
                    }
                    break;
                case 1565514205:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("adapter_only_third_party_impression")) {
                        b10 = -1;
                    } else {
                        b10 = 85;
                    }
                    break;
                case 1637553475:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("bid_response")) {
                        b10 = -1;
                    } else {
                        b10 = 40;
                    }
                    break;
                case 1638957285:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("video_start_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 6;
                    }
                    break;
                case 1686319423:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("ad_network_class_name")) {
                        b10 = -1;
                    } else {
                        b10 = 55;
                    }
                    break;
                case 1688341040:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("video_reward_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 7;
                    }
                    break;
                case 1799285870:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("use_third_party_container_height")) {
                        b10 = -1;
                    } else {
                        b10 = 48;
                    }
                    break;
                case 1839650832:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("renderers")) {
                        b10 = -1;
                    } else {
                        b10 = 0;
                    }
                    break;
                case 1875425491:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("is_analytics_logging_enabled")) {
                        b10 = -1;
                    } else {
                        b10 = 42;
                    }
                    break;
                case 2068142375:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("rule_line_external_id")) {
                        b10 = -1;
                    } else {
                        b10 = 52;
                    }
                    break;
                case 2072888499:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("manual_tracking_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 15;
                    }
                    break;
                case 2075506442:
                    list = listB14;
                    listB = list2;
                    if (!str.equals("render_serially")) {
                        b10 = -1;
                    } else {
                        b10 = 75;
                    }
                    break;
                case 2117205836:
                    listB = list2;
                    list = listB14;
                    if (!str.equals("flow_control")) {
                        b10 = -1;
                    } else {
                        b10 = 83;
                    }
                    break;
                default:
                    list = listB14;
                    listB = list2;
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    listB2 = K4.S.b(jsonReader);
                    listB14 = list;
                    break;
                case 1:
                    iC = c(jsonReader.nextString());
                    listB14 = list;
                    break;
                case 2:
                    listB7 = K4.S.b(jsonReader);
                    listB14 = list;
                    break;
                case 3:
                    listB8 = K4.S.b(jsonReader);
                    listB14 = list;
                    break;
                case 4:
                    listB9 = K4.S.b(jsonReader);
                    listB14 = list;
                    break;
                case 5:
                    iD = d(jsonReader.nextInt());
                    listB14 = list;
                    break;
                case 6:
                    listB10 = K4.S.b(jsonReader);
                    listB14 = list;
                    break;
                case 7:
                    listB11 = K4.S.b(jsonReader);
                    listB14 = list;
                    break;
                case 8:
                    listB12 = K4.S.b(jsonReader);
                    listB14 = list;
                    break;
                case 9:
                    strNextString3 = jsonReader.nextString();
                    listB14 = list;
                    break;
                case 10:
                    strNextString2 = jsonReader.nextString();
                    listB14 = list;
                    break;
                case 11:
                    c2519UrA = C2519Ur.a(K4.S.e(jsonReader));
                    listB14 = list;
                    break;
                case 12:
                    listB13 = K4.S.b(jsonReader);
                    listB14 = list;
                    break;
                case 13:
                    listB14 = K4.S.b(jsonReader);
                    break;
                case 14:
                    listB = K4.S.b(jsonReader);
                    listB14 = list;
                    break;
                case 15:
                    listB4 = K4.S.b(jsonReader);
                    listB14 = list;
                    break;
                case 16:
                    iNextInt = jsonReader.nextInt();
                    listB14 = list;
                    break;
                case 17:
                    listA2 = C3628gb0.a(jsonReader);
                    listB14 = list;
                    break;
                case 18:
                    c4130kb0 = new C4130kb0(jsonReader);
                    listB14 = list;
                    break;
                case 19:
                    listA = C3628gb0.a(jsonReader);
                    listB14 = list;
                    break;
                case 20:
                    listB3 = K4.S.b(jsonReader);
                    listB14 = list;
                    break;
                case 21:
                    strNextString4 = jsonReader.nextString();
                    listB14 = list;
                    break;
                case 22:
                    jSONObjectD = K4.S.d(jsonReader);
                    listB14 = list;
                    break;
                case 23:
                    strNextString5 = jsonReader.nextString();
                    listB14 = list;
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    strNextString6 = jsonReader.nextString();
                    listB14 = list;
                    break;
                case 25:
                    string = K4.S.d(jsonReader).toString();
                    listB14 = list;
                    break;
                case 26:
                    c1742FsA = C1742Fs.a(K4.S.d(jsonReader));
                    listB14 = list;
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    strNextString7 = jsonReader.nextString();
                    listB14 = list;
                    break;
                case 28:
                    jSONObjectD2 = K4.S.d(jsonReader);
                    listB14 = list;
                    break;
                case 29:
                    jSONObjectD3 = K4.S.d(jsonReader);
                    listB14 = list;
                    break;
                case 30:
                    zNextBoolean = jsonReader.nextBoolean();
                    listB14 = list;
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    zNextBoolean2 = jsonReader.nextBoolean();
                    listB14 = list;
                    break;
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                    zNextBoolean3 = jsonReader.nextBoolean();
                    listB14 = list;
                    break;
                case 33:
                    zNextBoolean4 = jsonReader.nextBoolean();
                    listB14 = list;
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    zNextBoolean5 = jsonReader.nextBoolean();
                    listB14 = list;
                    break;
                case 35:
                    zNextBoolean6 = jsonReader.nextBoolean();
                    listB14 = list;
                    break;
                case 36:
                    zNextBoolean7 = jsonReader.nextBoolean();
                    listB14 = list;
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    iE = e(jsonReader.nextString());
                    listB14 = list;
                    break;
                case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                    iNextInt2 = jsonReader.nextInt();
                    listB14 = list;
                    break;
                case 39:
                    zNextBoolean8 = jsonReader.nextBoolean();
                    listB14 = list;
                    break;
                case 40:
                    strNextString8 = jsonReader.nextString();
                    listB14 = list;
                    break;
                case 41:
                    jSONObjectD4 = K4.S.d(jsonReader);
                    listB14 = list;
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    zNextBoolean9 = jsonReader.nextBoolean();
                    listB14 = list;
                    break;
                case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FEED /* 43 */:
                    zNextBoolean10 = jsonReader.nextBoolean();
                    listB14 = list;
                    break;
                case 44:
                    iNextInt3 = jsonReader.nextInt();
                    listB14 = list;
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    iNextInt4 = jsonReader.nextInt();
                    listB14 = list;
                    break;
                case 46:
                    strNextString9 = jsonReader.nextString();
                    listB14 = list;
                    break;
                case 47:
                    strNextString10 = jsonReader.nextString();
                    listB14 = list;
                    break;
                case 48:
                    zNextBoolean11 = jsonReader.nextBoolean();
                    listB14 = list;
                    break;
                case 49:
                    c5670wqA = C5670wq.a(K4.S.d(jsonReader));
                    listB14 = list;
                    break;
                case 50:
                    jsonReader.nextBoolean();
                    listB14 = list;
                    break;
                case 51:
                    o2VarA = H4.o2.a(K4.S.d(jsonReader));
                    listB14 = list;
                    break;
                case 52:
                    strNextString11 = jsonReader.nextString();
                    listB14 = list;
                    break;
                case 53:
                    zNextBoolean12 = jsonReader.nextBoolean();
                    listB14 = list;
                    break;
                case 54:
                    jSONObjectD5 = K4.S.d(jsonReader);
                    listB14 = list;
                    break;
                case 55:
                    strNextString12 = jsonReader.nextString();
                    listB14 = list;
                    break;
                case 56:
                    strNextString19 = jsonReader.nextString();
                    listB14 = list;
                    break;
                case 57:
                    strNextString13 = jsonReader.nextString();
                    listB14 = list;
                    break;
                case 58:
                    strNextString14 = jsonReader.nextString();
                    listB14 = list;
                    break;
                case 59:
                    strNextString15 = jsonReader.nextString();
                    listB14 = list;
                    break;
                case 60:
                    strNextString16 = jsonReader.nextString();
                    listB14 = list;
                    break;
                case 61:
                    zNextBoolean13 = jsonReader.nextBoolean();
                    listB14 = list;
                    break;
                case 62:
                    jSONObjectD6 = K4.S.d(jsonReader);
                    listB14 = list;
                    break;
                case 63:
                    zNextBoolean14 = jsonReader.nextBoolean();
                    listB14 = list;
                    break;
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                    strNextString = jsonReader.nextString();
                    listB14 = list;
                    break;
                case 65:
                    zNextBoolean15 = jsonReader.nextBoolean();
                    listB14 = list;
                    break;
                case 66:
                    K4.S.b(jsonReader);
                    listB14 = list;
                    break;
                case 67:
                    zNextBoolean16 = jsonReader.nextBoolean();
                    listB14 = list;
                    break;
                case 68:
                    strNextString17 = jsonReader.nextString();
                    listB14 = list;
                    break;
                case 69:
                    strNextString18 = jsonReader.nextString();
                    listB14 = list;
                    break;
                case 70:
                    zNextBoolean17 = jsonReader.nextBoolean();
                    listB14 = list;
                    break;
                case 71:
                    zNextBoolean18 = jsonReader.nextBoolean();
                    listB14 = list;
                    break;
                case 72:
                    iNextInt5 = jsonReader.nextInt();
                    listB14 = list;
                    break;
                case 73:
                    strNextString20 = jsonReader.nextString();
                    listB14 = list;
                    break;
                case 74:
                    listB5 = K4.S.b(jsonReader);
                    listB14 = list;
                    break;
                case 75:
                    zNextBoolean19 = jsonReader.nextBoolean();
                    listB14 = list;
                    break;
                case 76:
                    dNextDouble = jsonReader.nextDouble();
                    listB14 = list;
                    break;
                case 77:
                    iA = AbstractC1977Kf0.a(jsonReader.nextInt());
                    listB14 = list;
                    break;
                case 78:
                    if (((Boolean) AbstractC3892ii.f29600K0.g()).booleanValue()) {
                        mapC = K4.S.c(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listB14 = list;
                    break;
                case 79:
                    if (((Boolean) AbstractC3892ii.S9.g()).booleanValue()) {
                        wVarB = L4.w.b(K4.S.d(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                    listB14 = list;
                    break;
                case 80:
                    if (((Boolean) AbstractC3892ii.U9.g()).booleanValue()) {
                        xVarD = L4.x.d(K4.S.d(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                    listB14 = list;
                    break;
                case 81:
                    if (((Boolean) AbstractC3892ii.pe.g()).booleanValue()) {
                        iNextInt6 = jsonReader.nextInt();
                    } else {
                        jsonReader.skipValue();
                    }
                    listB14 = list;
                    break;
                case 82:
                    listB6 = K4.S.b(jsonReader);
                    listB14 = list;
                    break;
                case 83:
                    zNextBoolean20 = jsonReader.nextBoolean();
                    listB14 = list;
                    break;
                case 84:
                    if (((Boolean) AbstractC3892ii.f29658P8.g()).booleanValue()) {
                        abstractC5931yu0A = C5622wS.a(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listB14 = list;
                    break;
                case 85:
                    zNextBoolean21 = jsonReader.nextBoolean();
                    listB14 = list;
                    break;
                case 86:
                    if (((Boolean) AbstractC3892ii.f29597J7.g()).booleanValue()) {
                        try {
                            Bundle bundleL = K4.S.l(K4.S.d(jsonReader));
                            if (bundleL != null) {
                                bundle2 = bundleL;
                            }
                        } catch (IllegalStateException unused) {
                            jsonReader.skipValue();
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                    listB14 = list;
                    break;
                case 87:
                    zNextBoolean22 = jsonReader.nextBoolean();
                    listB14 = list;
                    break;
                default:
                    jsonReader.skipValue();
                    listB14 = list;
                    break;
            }
            list2 = listB;
        }
        jsonReader.endObject();
        this.f28395a = listB2;
        this.f28397b = iC;
        this.f28399c = listB7;
        this.f28401d = listB8;
        this.f28405f = listB9;
        this.f28403e = iD;
        this.f28407g = listB10;
        this.f28409h = listB11;
        this.f28411i = listB12;
        this.f28413j = strNextString3;
        this.f28415k = strNextString2;
        this.f28417l = c2519UrA;
        this.f28419m = listB13;
        this.f28421n = listB14;
        this.f28423o = list2;
        this.f28425p = listB4;
        this.f28427q = iNextInt;
        this.f28429r = listA2;
        this.f28431s = c4130kb0;
        this.f28433t = listB3;
        this.f28435u = listA;
        this.f28439w = strNextString4;
        this.f28437v = jSONObjectD;
        this.f28441x = strNextString5;
        this.f28443y = strNextString6;
        this.f28445z = string;
        this.f28361A = c1742FsA;
        this.f28363B = strNextString7;
        this.f28365C = jSONObjectD2;
        this.f28367D = jSONObjectD3;
        this.f28378J = zNextBoolean;
        this.f28379K = zNextBoolean2;
        this.f28380L = zNextBoolean3;
        this.f28381M = zNextBoolean4;
        this.f28382N = zNextBoolean5;
        this.f28383O = zNextBoolean6;
        this.f28384P = zNextBoolean7;
        this.f28385Q = iE;
        this.f28386R = iNextInt2;
        this.f28388T = zNextBoolean8;
        this.f28389U = strNextString8;
        this.f28390V = new C1553Cb0(jSONObjectD4);
        this.f28391W = zNextBoolean9;
        this.f28392X = zNextBoolean10;
        this.f28393Y = iNextInt3;
        this.f28394Z = strNextString9;
        this.f28396a0 = iNextInt4;
        this.f28398b0 = strNextString10;
        this.f28400c0 = zNextBoolean11;
        this.f28402d0 = c5670wqA;
        this.f28404e0 = o2VarA;
        this.f28406f0 = strNextString11;
        this.f28408g0 = zNextBoolean12;
        this.f28410h0 = jSONObjectD5;
        this.f28369E = strNextString12;
        this.f28371F = strNextString13;
        this.f28373G = strNextString14;
        this.f28375H = strNextString15;
        this.f28377I = strNextString16;
        this.f28412i0 = zNextBoolean13;
        this.f28414j0 = jSONObjectD6;
        this.f28416k0 = zNextBoolean14;
        this.f28418l0 = strNextString;
        this.f28420m0 = zNextBoolean15;
        this.f28387S = zNextBoolean16;
        this.f28422n0 = strNextString17;
        this.f28424o0 = strNextString18;
        this.f28426p0 = strNextString19;
        this.f28428q0 = zNextBoolean17;
        this.f28430r0 = zNextBoolean18;
        this.f28432s0 = iNextInt5;
        this.f28436u0 = listB5;
        this.f28434t0 = strNextString20;
        this.f28438v0 = zNextBoolean19;
        this.f28440w0 = mapC;
        this.f28442x0 = wVarB;
        this.f28444y0 = xVarD;
        this.f28446z0 = dNextDouble;
        this.f28376H0 = iA;
        this.f28362A0 = listB6;
        this.f28364B0 = zNextBoolean20;
        this.f28366C0 = abstractC5931yu0A;
        this.f28368D0 = zNextBoolean21;
        this.f28370E0 = iNextInt6;
        this.f28372F0 = bundle2;
        this.f28374G0 = zNextBoolean22;
    }

    public static String a(int i10) {
        switch (i10) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int c(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int d(int i10) {
        if (i10 == 0 || i10 == 1 || i10 == 3 || i10 == 4) {
            return i10;
        }
        return 0;
    }

    private static int e(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        return "portrait".equalsIgnoreCase(str) ? 7 : -1;
    }

    public final boolean b() {
        return this.f28412i0 || this.f28444y0 != null;
    }
}
