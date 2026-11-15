package p218v7;

import java.util.HashSet;
import org.json.JSONObject;
import p228w7.b;
import p228w7.d;
import p228w7.e;
import p228w7.f;

/* JADX INFO: loaded from: classes3.dex */
public class c implements b.InterfaceC0555b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f50216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p228w7.c f50217b;

    public c(p228w7.c cVar) {
        this.f50217b = cVar;
    }

    @Override // p228w7.b.InterfaceC0555b
    public JSONObject a() {
        return this.f50216a;
    }

    public void b(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.f50217b.c(new e(this, hashSet, jSONObject, j10));
    }

    public void c() {
        this.f50217b.c(new d(this));
    }

    public void d(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.f50217b.c(new f(this, hashSet, jSONObject, j10));
    }

    @Override // p228w7.b.InterfaceC0555b
    public void a(JSONObject jSONObject) {
        this.f50216a = jSONObject;
    }
}
