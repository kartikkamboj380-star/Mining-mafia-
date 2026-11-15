package com.facebook.react.devsupport;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.Settings;
import c9.InterfaceC1217e;
import c9.InterfaceC1218f;
import com.facebook.react.bridge.ReactContext;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.devsupport.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1297t {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final b f14764j = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E3.a f14765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f14766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final K3.e f14767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c9.z f14768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1280b f14769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f0 f14770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f14771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private K3.c f14772h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private W f14773i;

    /* JADX INFO: renamed from: com.facebook.react.devsupport.t$a */
    private enum a {
        BUNDLE("bundle"),
        MAP("map");


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f14777e = p189s8.a.a(c());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f14778a;

        a(String str) {
            this.f14778a = str;
        }

        public final String d() {
            return this.f14778a;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.t$b */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(String str) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.reset();
                try {
                    Charset charsetForName = Charset.forName("UTF-8");
                    Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
                    byte[] bytes = str.getBytes(charsetForName);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    byte[] bArrDigest = messageDigest.digest(bytes);
                    kotlin.jvm.internal.H h10 = kotlin.jvm.internal.H.f45976a;
                    String str2 = String.format("%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x", Arrays.copyOf(new Object[]{Byte.valueOf(bArrDigest[0]), Byte.valueOf(bArrDigest[1]), Byte.valueOf(bArrDigest[2]), Byte.valueOf(bArrDigest[3]), Byte.valueOf(bArrDigest[4]), Byte.valueOf(bArrDigest[5]), Byte.valueOf(bArrDigest[6]), Byte.valueOf(bArrDigest[7]), Byte.valueOf(bArrDigest[8]), Byte.valueOf(bArrDigest[9]), Byte.valueOf(bArrDigest[10]), Byte.valueOf(bArrDigest[11]), Byte.valueOf(bArrDigest[12]), Byte.valueOf(bArrDigest[13]), Byte.valueOf(bArrDigest[14]), Byte.valueOf(bArrDigest[15]), Byte.valueOf(bArrDigest[16]), Byte.valueOf(bArrDigest[17]), Byte.valueOf(bArrDigest[18]), Byte.valueOf(bArrDigest[19])}, 20));
                    Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                    return str2;
                } catch (UnsupportedEncodingException e10) {
                    throw new AssertionError("This environment doesn't support UTF-8 encoding", e10);
                }
            } catch (NoSuchAlgorithmException e11) {
                throw new AssertionError("Could not get standard SHA-256 algorithm", e11);
            }
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.t$c */
    public interface c {
        void a();

        void b();

        void c();

        void d();

        Map e();
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.t$d */
    public static final class d extends AsyncTask {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... params) {
            Intrinsics.checkNotNullParameter(params, "params");
            W w10 = C1297t.this.f14773i;
            if (w10 != null) {
                w10.closeQuietly();
            }
            C1297t.this.f14773i = null;
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.t$e */
    public static final class e extends AsyncTask {
        e() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... params) {
            Intrinsics.checkNotNullParameter(params, "params");
            K3.c cVar = C1297t.this.f14772h;
            if (cVar != null) {
                cVar.e();
            }
            C1297t.this.f14772h = null;
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.t$f */
    public static final class f implements InterfaceC1218f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ReactContext f14781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f14782b;

        f(ReactContext reactContext, String str) {
            this.f14781a = reactContext;
            this.f14782b = str;
        }

        @Override // c9.InterfaceC1218f
        public void onFailure(InterfaceC1217e call, IOException e10) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(e10, "e");
            ReactContext reactContext = this.f14781a;
            String str = this.f14782b;
            if (str == null) {
                str = "openDebugger error";
            }
            W3.d.d(reactContext, str);
        }

        @Override // c9.InterfaceC1218f
        public void onResponse(InterfaceC1217e call, c9.D response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.t$g */
    public static final class g extends AsyncTask {
        g() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... params) {
            Intrinsics.checkNotNullParameter(params, "params");
            String str = (String) com.facebook.react.modules.systeminfo.a.f(C1297t.this.f14766b).get("deviceName");
            if (str == null) {
                Z1.a.I("ReactNative", "Could not get device name from Inspector Host Metadata.");
                return null;
            }
            C1297t c1297t = C1297t.this;
            CxxInspectorPackagerConnection cxxInspectorPackagerConnection = new CxxInspectorPackagerConnection(C1297t.this.s(), str, C1297t.this.f14771g);
            cxxInspectorPackagerConnection.connect();
            c1297t.f14773i = cxxInspectorPackagerConnection;
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.t$h */
    public static final class h extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f14784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f14785b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1297t f14786c;

        /* JADX INFO: renamed from: com.facebook.react.devsupport.t$h$a */
        public static final class a extends K3.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f14787a;

            a(c cVar) {
                this.f14787a = cVar;
            }

            @Override // K3.h
            public void a(Object obj) {
                this.f14787a.c();
            }
        }

        /* JADX INFO: renamed from: com.facebook.react.devsupport.t$h$b */
        public static final class b extends K3.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f14788a;

            b(c cVar) {
                this.f14788a = cVar;
            }

            @Override // K3.h
            public void a(Object obj) {
                this.f14788a.b();
            }
        }

        /* JADX INFO: renamed from: com.facebook.react.devsupport.t$h$c */
        public static final class c implements K3.g.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f14789a;

            c(c cVar) {
                this.f14789a = cVar;
            }

            @Override // K3.g.b
            public void onConnected() {
                this.f14789a.a();
            }

            @Override // K3.g.b
            public void onDisconnected() {
                this.f14789a.d();
            }
        }

        h(c cVar, String str, C1297t c1297t) {
            this.f14784a = cVar;
            this.f14785b = str;
            this.f14786c = c1297t;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... backgroundParams) {
            Intrinsics.checkNotNullParameter(backgroundParams, "backgroundParams");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("reload", new a(this.f14784a));
            linkedHashMap.put("devMenu", new b(this.f14784a));
            Map mapE = this.f14784a.e();
            if (mapE != null) {
                linkedHashMap.putAll(mapE);
            }
            linkedHashMap.putAll(new K3.b().e());
            c cVar = new c(this.f14784a);
            if (this.f14785b == null) {
                throw new IllegalStateException("Required value was null.");
            }
            C1297t c1297t = this.f14786c;
            K3.c cVar2 = new K3.c(this.f14785b, this.f14786c.f14767c, linkedHashMap, cVar);
            cVar2.f();
            c1297t.f14772h = cVar2;
            return null;
        }
    }

    public C1297t(E3.a settings, Context applicationContext, K3.e packagerConnectionSettings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(packagerConnectionSettings, "packagerConnectionSettings");
        this.f14765a = settings;
        this.f14766b = applicationContext;
        this.f14767c = packagerConnectionSettings;
        c9.z.a aVar = new c9.z.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c9.z zVarB = aVar.e(ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT, timeUnit).M(0L, timeUnit).N(0L, timeUnit).b();
        this.f14768d = zVarB;
        this.f14769e = new C1280b(zVarB);
        this.f14770f = new f0(zVarB);
        String packageName = applicationContext.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        this.f14771g = packageName;
    }

    private final String k(String str, a aVar, String str2, boolean z9, boolean z10) {
        boolean zP = p();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : this.f14767c.a().entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            if (str4.length() != 0) {
                sb.append("&" + str3 + "=" + Uri.encode(str4));
            }
        }
        kotlin.jvm.internal.H h10 = kotlin.jvm.internal.H.f45976a;
        String str5 = String.format(Locale.US, "http://%s/%s.%s?platform=android&dev=%s&lazy=%s&minify=%s&app=%s&modulesOnly=%s&runModule=%s", Arrays.copyOf(new Object[]{str2, str, aVar.d(), Boolean.valueOf(zP), Boolean.valueOf(zP), Boolean.valueOf(t()), this.f14771g, z9 ? "true" : "false", z10 ? "true" : "false"}, 9));
        Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
        return str5 + (InspectorFlags.getFuseboxEnabled() ? "&excludeSource=true&sourcePaths=url-server" : "") + ((Object) sb);
    }

    static /* synthetic */ String l(C1297t c1297t, String str, a aVar, String str2, boolean z9, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createBundleURL");
        }
        if ((i10 & 4) != 0) {
            str2 = c1297t.f14767c.b();
        }
        String str3 = str2;
        if ((i10 & 8) != 0) {
            z9 = false;
        }
        boolean z11 = z9;
        if ((i10 & 16) != 0) {
            z10 = true;
        }
        return c1297t.k(str, aVar, str3, z11, z10);
    }

    public static /* synthetic */ void o(C1297t c1297t, p124m3.b bVar, File file, String str, C1280b.a aVar, c9.B.a aVar2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: downloadBundleFromURL");
        }
        if ((i10 & 16) != 0) {
            aVar2 = new c9.B.a();
        }
        c1297t.n(bVar, file, str, aVar, aVar2);
    }

    private final boolean p() {
        return this.f14765a.p();
    }

    private final String r() {
        String str = this.f14771g;
        String string = Settings.Secure.getString(this.f14766b.getContentResolver(), "android_id");
        kotlin.jvm.internal.H h10 = kotlin.jvm.internal.H.f45976a;
        String str2 = String.format(Locale.US, "android-%s-%s-%s", Arrays.copyOf(new Object[]{str, string, InspectorFlags.getFuseboxEnabled() ? "fusebox" : "legacy"}, 3));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return f14764j.b(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String s() {
        kotlin.jvm.internal.H h10 = kotlin.jvm.internal.H.f45976a;
        String str = String.format(Locale.US, "http://%s/inspector/device?name=%s&app=%s&device=%s&profiling=%b", Arrays.copyOf(new Object[]{this.f14767c.b(), Uri.encode(com.facebook.react.modules.systeminfo.a.e()), Uri.encode(this.f14771g), Uri.encode(r()), Boolean.valueOf(InspectorFlags.getIsProfilingBuild())}, 5));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private final boolean t() {
        return this.f14765a.o();
    }

    public final void i() {
        new d().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public final void j() {
        new e().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public final void m() {
        W w10 = this.f14773i;
        if (w10 != null) {
            w10.sendEventToAllConnections("{ \"id\":1,\"method\":\"Debugger.disable\" }");
        }
    }

    public final void n(p124m3.b callback, File outputFile, String str, C1280b.a aVar, c9.B.a requestBuilder) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        Intrinsics.checkNotNullParameter(requestBuilder, "requestBuilder");
        this.f14769e.e(callback, outputFile, str, aVar, requestBuilder);
    }

    public String q(String jsModulePath) {
        Intrinsics.checkNotNullParameter(jsModulePath, "jsModulePath");
        return l(this, jsModulePath, a.BUNDLE, this.f14767c.b(), false, false, 24, null);
    }

    public String u(String mainModuleName) {
        Intrinsics.checkNotNullParameter(mainModuleName, "mainModuleName");
        return l(this, mainModuleName, a.BUNDLE, null, false, false, 28, null);
    }

    public void v(p124m3.g callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f14770f.a(this.f14767c.b(), callback);
    }

    public final void w(ReactContext reactContext, String str) {
        kotlin.jvm.internal.H h10 = kotlin.jvm.internal.H.f45976a;
        String str2 = String.format(Locale.US, "http://%s/open-debugger?device=%s", Arrays.copyOf(new Object[]{this.f14767c.b(), Uri.encode(r())}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        FirebasePerfOkHttpClient.enqueue(this.f14768d.b(new c9.B.a().m(str2).g("POST", c9.C.f11923a.a(null, "")).b()), new f(reactContext, str));
    }

    public final void x() {
        if (this.f14773i != null) {
            Z1.a.I("ReactNative", "Inspector connection already open, nooping.");
        } else {
            new g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public final void y(String str, c commandListener) {
        Intrinsics.checkNotNullParameter(commandListener, "commandListener");
        if (this.f14772h != null) {
            Z1.a.I("ReactNative", "Packager connection already open, nooping.");
        } else {
            new h(commandListener, str, this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }
}
