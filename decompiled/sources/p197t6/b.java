package p197t6;

import org.json.JSONObject;
import p117l6.E;

/* JADX INFO: loaded from: classes3.dex */
class b implements i {
    b() {
    }

    static d b(E e10) {
        return new d(e10.a() + ((long) 3600000), new d.b(8, 4), new d.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // p197t6.i
    public d a(E e10, JSONObject jSONObject) {
        return b(e10);
    }
}
