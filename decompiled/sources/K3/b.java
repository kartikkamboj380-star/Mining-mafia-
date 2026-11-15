package K3;

import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final d f2551e = new d(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f2552f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2553a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f2554b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f2555c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f2556d;

    public static final class a extends i {
        a() {
        }

        @Override // K3.h
        public void b(Object obj, j responder) {
            Intrinsics.checkNotNullParameter(responder, "responder");
            Map map = b.this.f2555c;
            b bVar = b.this;
            synchronized (map) {
                try {
                    try {
                        JSONObject jSONObject = (JSONObject) obj;
                        if (jSONObject == null) {
                            throw new Exception("params must be an object { mode: string, filename: string }");
                        }
                        String strOptString = jSONObject.optString("mode");
                        if (strOptString == null) {
                            throw new Exception("missing params.mode");
                        }
                        String strOptString2 = jSONObject.optString("filename");
                        if (strOptString2 == null) {
                            throw new Exception("missing params.filename");
                        }
                        if (!Intrinsics.b(strOptString, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ)) {
                            throw new IllegalArgumentException(("unsupported mode: " + strOptString).toString());
                        }
                        responder.a(Integer.valueOf(bVar.d(strOptString2)));
                        Unit unit = Unit.f45918a;
                    } catch (Exception e10) {
                        responder.b(e10.toString());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: K3.b$b, reason: collision with other inner class name */
    public static final class C0037b extends i {
        C0037b() {
        }

        @Override // K3.h
        public void b(Object obj, j responder) {
            Intrinsics.checkNotNullParameter(responder, "responder");
            Map map = b.this.f2555c;
            b bVar = b.this;
            synchronized (map) {
                try {
                    try {
                        if (!(obj instanceof Number)) {
                            throw new Exception("params must be a file handle");
                        }
                        e eVar = (e) bVar.f2555c.get(obj);
                        if (eVar == null) {
                            throw new Exception("invalid file handle, it might have timed out");
                        }
                        I.b(bVar.f2555c).remove(obj);
                        eVar.a();
                        responder.a("");
                        Unit unit = Unit.f45918a;
                    } catch (Exception e10) {
                        responder.b(e10.toString());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class c extends i {
        c() {
        }

        @Override // K3.h
        public void b(Object obj, j responder) {
            Intrinsics.checkNotNullParameter(responder, "responder");
            Map map = b.this.f2555c;
            b bVar = b.this;
            synchronized (map) {
                try {
                    try {
                        JSONObject jSONObject = (JSONObject) obj;
                        if (jSONObject == null) {
                            throw new Exception("params must be an object { file: handle, size: number }");
                        }
                        int iOptInt = jSONObject.optInt("file");
                        if (iOptInt == 0) {
                            throw new Exception("invalid or missing file handle");
                        }
                        int iOptInt2 = jSONObject.optInt("size");
                        if (iOptInt2 == 0) {
                            throw new Exception("invalid or missing read size");
                        }
                        e eVar = (e) bVar.f2555c.get(Integer.valueOf(iOptInt));
                        if (eVar == null) {
                            throw new Exception("invalid file handle, it might have timed out");
                        }
                        responder.a(eVar.d(iOptInt2));
                        Unit unit = Unit.f45918a;
                    } catch (Exception e10) {
                        responder.b(e10.toString());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FileInputStream f2560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f2561b = System.currentTimeMillis() + 30000;

        public e(String str) {
            this.f2560a = new FileInputStream(str);
        }

        private final void c() {
            this.f2561b = System.currentTimeMillis() + 30000;
        }

        public final void a() throws IOException {
            this.f2560a.close();
        }

        public final boolean b() {
            return System.currentTimeMillis() >= this.f2561b;
        }

        public final String d(int i10) {
            c();
            byte[] bArr = new byte[i10];
            String strEncodeToString = Base64.encodeToString(bArr, 0, this.f2560a.read(bArr), 0);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
            return strEncodeToString;
        }
    }

    static {
        String simpleName = K3.c.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        f2552f = simpleName;
    }

    public b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f2556d = linkedHashMap;
        linkedHashMap.put("fopen", new a());
        linkedHashMap.put("fclose", new C0037b());
        linkedHashMap.put("fread", new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int d(String str) {
        int i10 = this.f2553a;
        this.f2553a = i10 + 1;
        this.f2555c.put(Integer.valueOf(i10), new e(str));
        if (this.f2555c.size() == 1) {
            this.f2554b.postDelayed(this, 30000L);
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "<destruct>");
        e eVar = (e) entry.getValue();
        if (!eVar.b()) {
            return false;
        }
        try {
            eVar.a();
            return true;
        } catch (IOException e10) {
            Z1.a.n(f2552f, "Failed to close expired file", e10);
            return true;
        }
    }

    public final Map e() {
        return this.f2556d;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f2555c) {
            try {
                CollectionsKt.A(this.f2555c.entrySet(), new Function1() { // from class: K3.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(b.f((Map.Entry) obj));
                    }
                });
                if (!this.f2555c.isEmpty()) {
                    this.f2554b.postDelayed(this, 30000L);
                }
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
