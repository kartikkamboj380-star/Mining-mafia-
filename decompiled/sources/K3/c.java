package K3;

import android.net.Uri;
import app.notifee.core.event.LogEvent;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import r9.C7108k;

/* JADX INFO: loaded from: classes.dex */
public final class c implements g.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f2562c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f2563d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f2564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f2565b;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final class b implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f2566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f2567b;

        public b(c cVar, Object id) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.f2567b = cVar;
            this.f2566a = id;
        }

        @Override // K3.j
        public void a(Object result) {
            Intrinsics.checkNotNullParameter(result, "result");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("version", 2);
                jSONObject.put("id", this.f2566a);
                jSONObject.put("result", result);
                g gVar = this.f2567b.f2565b;
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                gVar.o(string);
            } catch (Exception e10) {
                Z1.a.n(c.f2563d, "Responding failed", e10);
            }
        }

        @Override // K3.j
        public void b(Object error) {
            Intrinsics.checkNotNullParameter(error, "error");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("version", 2);
                jSONObject.put("id", this.f2566a);
                jSONObject.put(LogEvent.LEVEL_ERROR, error);
                g gVar = this.f2567b.f2565b;
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                gVar.o(string);
            } catch (Exception e10) {
                Z1.a.n(c.f2563d, "Responding with error failed", e10);
            }
        }
    }

    static {
        String simpleName = c.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        f2563d = simpleName;
    }

    public c(String clientId, e settings, Map requestHandlers, g.b bVar) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(requestHandlers, "requestHandlers");
        this.f2564a = requestHandlers;
        String string = new Uri.Builder().scheme("ws").encodedAuthority(settings.b()).appendPath(PglCryptUtils.KEY_MESSAGE).appendQueryParameter("device", com.facebook.react.modules.systeminfo.a.e()).appendQueryParameter("app", settings.c()).appendQueryParameter("clientid", clientId).build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.f2565b = new g(string, this, bVar);
    }

    private final void b(Object obj, String str) {
        if (obj != null) {
            new b(this, obj).b(str);
        }
        Z1.a.m(f2563d, "Handling the message failed with reason: " + str);
    }

    @Override // K3.g.c
    public void a(C7108k bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Z1.a.I(f2563d, "Websocket received message with payload of unexpected type binary");
    }

    public final void e() {
        this.f2565b.i();
    }

    public final void f() {
        this.f2565b.k();
    }

    @Override // K3.g.c
    public void onMessage(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        try {
            JSONObject jSONObject = new JSONObject(text);
            int iOptInt = jSONObject.optInt("version");
            String strOptString = jSONObject.optString("method");
            Object objOpt = jSONObject.opt("id");
            Object objOpt2 = jSONObject.opt("params");
            if (iOptInt != 2) {
                Z1.a.m(f2563d, "Message with incompatible or missing version of protocol received: " + iOptInt);
                return;
            }
            if (strOptString == null) {
                b(objOpt, "No method provided");
                return;
            }
            h hVar = (h) this.f2564a.get(strOptString);
            if (hVar == null) {
                b(objOpt, "No request handler for method: " + strOptString);
                return;
            }
            if (objOpt == null) {
                hVar.a(objOpt2);
            } else {
                hVar.b(objOpt2, new b(this, objOpt));
            }
        } catch (Exception e10) {
            Z1.a.n(f2563d, "Handling the message failed", e10);
        }
    }
}
