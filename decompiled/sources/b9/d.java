package b9;

import android.graphics.Color;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f11646a;

    public d(Bundle bundle) {
        this.f11646a = bundle;
    }

    public Integer a() {
        if (this.f11646a.containsKey("lightColor")) {
            return Integer.valueOf(Color.parseColor(this.f11646a.getString("lightColor")));
        }
        return null;
    }
}
