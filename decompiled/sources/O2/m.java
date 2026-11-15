package O2;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f4488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f4489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f4490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f4491e;

    public m(int i10, int i11, int i12, o oVar, Map map) {
        this.f4487a = i10;
        this.f4488b = i11;
        this.f4489c = i12;
        this.f4490d = oVar;
        this.f4491e = map;
    }

    @Override // O2.k, p243y2.a
    public Map getExtras() {
        return this.f4491e;
    }

    @Override // O2.l
    public int getHeight() {
        return this.f4488b;
    }

    @Override // O2.l
    public int getWidth() {
        return this.f4487a;
    }
}
