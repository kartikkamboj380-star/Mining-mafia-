package E;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    static class a {
        static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d[] f519a;

        public c(d[] dVarArr) {
            this.f519a = dVarArr;
        }

        public d[] a() {
            return this.f519a;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f522c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f523d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f524e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f525f;

        public d(String str, int i10, boolean z9, String str2, int i11, int i12) {
            this.f520a = str;
            this.f521b = i10;
            this.f522c = z9;
            this.f523d = str2;
            this.f524e = i11;
            this.f525f = i12;
        }

        public String a() {
            return this.f520a;
        }

        public int b() {
            return this.f525f;
        }

        public int c() {
            return this.f524e;
        }

        public String d() {
            return this.f523d;
        }

        public int e() {
            return this.f521b;
        }

        public boolean f() {
            return this.f522c;
        }
    }

    /* JADX INFO: renamed from: E.e$e, reason: collision with other inner class name */
    public static final class C0019e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final L.e f526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f528c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f529d;

        public C0019e(L.e eVar, int i10, int i11, String str) {
            this.f526a = eVar;
            this.f528c = i10;
            this.f527b = i11;
            this.f529d = str;
        }

        public int a() {
            return this.f528c;
        }

        public L.e b() {
            return this.f526a;
        }

        public String c() {
            return this.f529d;
        }

        public int d() {
            return this.f527b;
        }
    }

    private static int a(TypedArray typedArray, int i10) {
        return a.a(typedArray, i10);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < typedArrayObtainTypedArray.length(); i11++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), B.d.f125h);
        String string = typedArrayObtainAttributes.getString(B.d.f126i);
        String string2 = typedArrayObtainAttributes.getString(B.d.f130m);
        String string3 = typedArrayObtainAttributes.getString(B.d.f131n);
        int resourceId = typedArrayObtainAttributes.getResourceId(B.d.f127j, 0);
        int integer = typedArrayObtainAttributes.getInteger(B.d.f128k, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(B.d.f129l, UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        String string4 = typedArrayObtainAttributes.getString(B.d.f132o);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new C0019e(new L.e(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    private static d f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), B.d.f133p);
        int i10 = typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(B.d.f142y) ? B.d.f142y : B.d.f135r, CommonGatewayClient.CODE_400);
        boolean z9 = 1 == typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(B.d.f140w) ? B.d.f140w : B.d.f136s, 0);
        int i11 = typedArrayObtainAttributes.hasValue(B.d.f143z) ? B.d.f143z : B.d.f137t;
        String string = typedArrayObtainAttributes.getString(typedArrayObtainAttributes.hasValue(B.d.f141x) ? B.d.f141x : B.d.f138u);
        int i12 = typedArrayObtainAttributes.getInt(i11, 0);
        int i13 = typedArrayObtainAttributes.hasValue(B.d.f139v) ? B.d.f139v : B.d.f134q;
        int resourceId = typedArrayObtainAttributes.getResourceId(i13, 0);
        String string2 = typedArrayObtainAttributes.getString(i13);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i10, z9, string, i12, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    private static List h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
