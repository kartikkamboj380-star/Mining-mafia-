package O7;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f4578a;

    public b(boolean z9) {
        this.f4578a = z9;
    }

    public boolean b() {
        return this.f4578a;
    }

    @Override // O7.a
    public void disable() {
        this.f4578a = false;
    }

    @Override // O7.a
    public void enable() {
        this.f4578a = true;
    }

    public /* synthetic */ b(boolean z9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z9);
    }
}
