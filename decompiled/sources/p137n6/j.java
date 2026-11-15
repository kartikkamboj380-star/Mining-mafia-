package p137n6;

import B6.d;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import org.json.JSONObject;
import p147o6.F;
import p257z6.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f46960a = new d().j(a.f46911a).i();

    static j a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return b(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion"));
    }

    public static j b(String str, String str2, String str3, String str4, long j10) {
        return new b(str, str2, i(str3), str4, j10);
    }

    private static String i(String str) {
        return str.length() > 256 ? str.substring(0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) : str;
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract long f();

    public abstract String g();

    public F.e.d.AbstractC0507e h() {
        return F.e.d.AbstractC0507e.a().d(F.e.d.AbstractC0507e.b.a().c(g()).b(e()).a()).b(c()).c(d()).e(f()).a();
    }
}
