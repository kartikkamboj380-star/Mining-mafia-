package p197t6;

import org.json.JSONObject;
import p087i6.g;
import p117l6.E;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E f49715a;

    h(E e10) {
        this.f49715a = e10;
    }

    private static i a(int i10) {
        if (i10 == 3) {
            return new m();
        }
        g.f().d("Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.");
        return new b();
    }

    public d b(JSONObject jSONObject) {
        return a(jSONObject.getInt("settings_version")).a(this.f49715a, jSONObject);
    }
}
