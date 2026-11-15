package com.bytedance.sdk.openadsdk.core.vvw.kq.kq;

import android.content.Context;
import android.text.TextUtils;
import android.util.Xml;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.sdk.openadsdk.core.model.uml;
import com.bytedance.sdk.openadsdk.core.vvw.nn;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class csi extends com.bytedance.sdk.openadsdk.core.vvw.kq.oq {
    public static final String rjo = null;

    public csi(Context context, int i10, int i11) {
        super(context, i10, i11);
    }

    private void bob(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq((uml) null, (List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob>) Collections.singletonList(new com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(str).kq()), this.kq > 0 ? com.bytedance.sdk.openadsdk.core.vvw.kq.kq.NO_ADS_VAST_RESPONSE : com.bytedance.sdk.openadsdk.core.vvw.kq.kq.UNDEFINED_ERROR, -1L, (String) null, (String) null), (com.bytedance.sdk.openadsdk.core.vvw.oq.bob.oq) null);
    }

    public static int oq(String str) {
        if (TextUtils.isEmpty(str)) {
            return LinearLayoutManager.INVALID_OFFSET;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return LinearLayoutManager.INVALID_OFFSET;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.core.vvw.kq.oq
    public com.bytedance.sdk.openadsdk.core.vvw.kq kq(String str, File file, List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> list) throws Throwable {
        InputStream byteArrayInputStream;
        this.csi = 0;
        InputStream inputStream = null;
        if (this.oq == null) {
            this.csi = -1;
            return null;
        }
        if (TextUtils.isEmpty(str) && file == null) {
            this.csi = -2;
            return null;
        }
        try {
            byteArrayInputStream = !TextUtils.isEmpty(str) ? new ByteArrayInputStream(str.getBytes("UTF-8")) : new FileInputStream(file);
            try {
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                    xmlPullParserNewPullParser.setInput(byteArrayInputStream, "UTF-8");
                    xmlPullParserNewPullParser.nextTag();
                    com.bytedance.sdk.openadsdk.core.vvw.kq kqVarKq = kq(xmlPullParserNewPullParser, list);
                    kq(kqVarKq);
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException unused) {
                    }
                    return kqVarKq;
                } catch (Exception unused2) {
                    this.csi = -3;
                    kq((com.bytedance.sdk.openadsdk.core.vvw.kq) null);
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream = byteArrayInputStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            byteArrayInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    static class kq {
        com.bytedance.sdk.openadsdk.core.vvw.bob.kq.oq bob;
        String fou;
        String kq;
        com.bytedance.sdk.openadsdk.core.vvw.bob.kq.EnumC0289kq oq;
        final List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> csi = new ArrayList();
        final List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> rhi = new ArrayList();
        float rjo = Float.MIN_VALUE;

        public kq() {
        }

        public void kq(String str, com.bytedance.sdk.openadsdk.core.vvw.bob.kq.EnumC0289kq enumC0289kq, com.bytedance.sdk.openadsdk.core.vvw.bob.kq.oq oqVar) {
            this.kq = str;
            this.oq = enumC0289kq;
            this.bob = oqVar;
        }

        public void oq(String str) {
            this.rhi.add(new com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(str).kq());
        }

        public void kq(String str) {
            this.csi.add(new com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(str).kq());
        }

        public kq(String str, com.bytedance.sdk.openadsdk.core.vvw.bob.kq.EnumC0289kq enumC0289kq, com.bytedance.sdk.openadsdk.core.vvw.bob.kq.oq oqVar) {
            kq(str, enumC0289kq, oqVar);
        }
    }

    public static String oq(XmlPullParser xmlPullParser, String str) {
        String strTrim;
        String str2 = rjo;
        xmlPullParser.require(2, str2, str);
        if (xmlPullParser.next() == 4) {
            strTrim = xmlPullParser.getText().trim();
            xmlPullParser.nextTag();
        } else {
            strTrim = "";
        }
        xmlPullParser.require(3, str2, str);
        return strTrim;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [com.bytedance.sdk.openadsdk.core.vvw.kq] */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.bytedance.sdk.openadsdk.core.vvw.kq.kq.csi, com.bytedance.sdk.openadsdk.core.vvw.kq.oq] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v2 */
    private com.bytedance.sdk.openadsdk.core.vvw.kq oq(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> list) throws Throwable {
        ?? r16;
        ?? r10 = 0;
        if (this.kq >= 5) {
            kq(xmlPullParser);
            return null;
        }
        com.bytedance.sdk.openadsdk.core.vvw.fou fouVar = new com.bytedance.sdk.openadsdk.core.vvw.fou();
        String str = null;
        com.bytedance.sdk.openadsdk.core.vvw.bob bobVarKq = null;
        Set<nn> setKq = null;
        while (true) {
            if (xmlPullParser.getEventType() == 3 && "Wrapper".equals(xmlPullParser.getName())) {
                com.bytedance.sdk.openadsdk.core.vvw.kq kqVarKq = kq(str, r10, list);
                if (kqVarKq != null) {
                    if (kqVarKq.bob() == null) {
                        kqVarKq.kq(bobVarKq);
                    }
                    kqVarKq.kq().kq(fouVar);
                    if (setKq != null) {
                        kqVarKq.kq(setKq);
                    }
                }
                return kqVarKq;
            }
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                r16 = r10;
                switch (name) {
                    case "VASTAdTagURI":
                        String strKq = kq(oq(xmlPullParser, "VASTAdTagURI"), list);
                        if (!TextUtils.isEmpty(strKq)) {
                            str = strKq;
                            continue;
                            break;
                        } else {
                            kq(xmlPullParser, "Wrapper", 3);
                            this.csi = -2;
                            return r16;
                        }
                        break;
                    case "Error":
                        list.add(new com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(oq(xmlPullParser, "Error")).kq());
                        continue;
                        break;
                    case "Extensions":
                        break;
                    case "TrackingEvents":
                        bob.kq(xmlPullParser, fouVar);
                        continue;
                        break;
                    case "CompanionAds":
                        bobVarKq = com.bytedance.sdk.openadsdk.core.vvw.kq.kq.kq.kq(this.oq, xmlPullParser);
                        continue;
                        break;
                    case "ClickTracking":
                        fouVar.rjo(kq(xmlPullParser, "ClickTracking"));
                        continue;
                        break;
                    case "Impression":
                        fouVar.kq(kq(xmlPullParser, name));
                        continue;
                        break;
                    default:
                        continue;
                        break;
                }
                while (true) {
                    if (xmlPullParser.getEventType() != 3 || !"Extensions".equals(xmlPullParser.getName())) {
                        xmlPullParser.next();
                        if (xmlPullParser.getEventType() == 2 && "AdVerifications".equals(xmlPullParser.getName())) {
                            setKq = fou.kq(xmlPullParser);
                        }
                    }
                }
            } else {
                r16 = r10;
            }
            r10 = r16;
        }
    }

    private void kq(com.bytedance.sdk.openadsdk.core.vvw.kq kqVar) {
        if (this.rhi == null) {
            this.rhi = new com.bytedance.sdk.openadsdk.core.vvw.kq.oq.kq();
        }
        com.bytedance.sdk.openadsdk.core.vvw.kq.oq.kq kqVar2 = this.rhi;
        kqVar2.kq = this.csi;
        kqVar2.oq = this.kq;
        if (kqVar != null) {
            kqVar2.bob = kqVar.kq().oq.size() <= 0;
        }
    }

    private com.bytedance.sdk.openadsdk.core.vvw.kq kq(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> list) throws Throwable {
        XmlPullParser xmlPullParser2;
        List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> list2;
        XmlPullParser xmlPullParser3;
        List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> list3;
        xmlPullParser.require(2, rjo, "VAST");
        boolean z9 = false;
        String strOq = null;
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("Error".equals(name)) {
                    strOq = oq(xmlPullParser, name);
                } else {
                    if ("Ad".equals(name)) {
                        if (kq(xmlPullParser.getAttributeValue(rjo, "sequence"))) {
                            while (true) {
                                if (xmlPullParser.next() == 3 && "Ad".equals(xmlPullParser.getName())) {
                                    xmlPullParser2 = xmlPullParser;
                                    list2 = list;
                                    z9 = true;
                                    break;
                                }
                                if (xmlPullParser.getEventType() == 2) {
                                    String name2 = xmlPullParser.getName();
                                    if ("InLine".equals(name2)) {
                                        xmlPullParser3 = xmlPullParser;
                                        list3 = list;
                                        com.bytedance.sdk.openadsdk.core.vvw.kq kqVarKq = oq.kq(this.oq, xmlPullParser3, list3, this.bob, this.fou);
                                        if (kqVarKq != null) {
                                            if (!TextUtils.isEmpty(kqVarKq.rjo())) {
                                                return kqVarKq;
                                            }
                                            this.csi = -6;
                                            return null;
                                        }
                                    } else {
                                        xmlPullParser3 = xmlPullParser;
                                        list3 = list;
                                        if ("Wrapper".equals(name2)) {
                                            com.bytedance.sdk.openadsdk.core.vvw.kq kqVarOq = oq(xmlPullParser3, list3);
                                            if (kqVarOq != null) {
                                                return kqVarOq;
                                            }
                                        } else {
                                            kq(xmlPullParser3);
                                        }
                                    }
                                    xmlPullParser = xmlPullParser3;
                                    list = list3;
                                }
                            }
                        } else {
                            kq(xmlPullParser);
                            z9 = true;
                        }
                    } else {
                        xmlPullParser2 = xmlPullParser;
                        list2 = list;
                        kq(xmlPullParser2);
                    }
                    xmlPullParser = xmlPullParser2;
                    list = list2;
                }
            }
        }
        if (!z9) {
            this.csi = -4;
            bob(strOq);
        }
        if (this.csi == 0) {
            this.csi = -5;
        }
        return null;
    }

    public static List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> kq(XmlPullParser xmlPullParser, String str) {
        return kq(xmlPullParser, str, false);
    }

    public static List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> kq(XmlPullParser xmlPullParser, String str, boolean z9) {
        return kq(oq(xmlPullParser, str), z9);
    }

    public static void kq(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i10 = 1;
        while (i10 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public static void kq(XmlPullParser xmlPullParser, String str, int i10) {
        while (xmlPullParser.getEventType() != 1) {
            if (str.equals(xmlPullParser.getName()) && xmlPullParser.getEventType() == i10) {
                return;
            } else {
                xmlPullParser.next();
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> kq(String str, boolean z9) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Collections.singletonList(new com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(str).kq(z9).kq());
    }
}
