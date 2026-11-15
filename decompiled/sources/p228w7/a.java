package p228w7;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet f50384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f50385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f50386e;

    public a(b.InterfaceC0555b interfaceC0555b, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0555b);
        this.f50384c = new HashSet(hashSet);
        this.f50385d = jSONObject;
        this.f50386e = j10;
    }
}
