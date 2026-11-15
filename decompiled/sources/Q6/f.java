package Q6;

import com.google.firebase.perf.config.RemoteConfigManager;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements p079h8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f5068a;

    public f(a aVar) {
        this.f5068a = aVar;
    }

    public static f a(a aVar) {
        return new f(aVar);
    }

    public static RemoteConfigManager c(a aVar) {
        return (RemoteConfigManager) p079h8.b.c(aVar.e());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RemoteConfigManager get() {
        return c(this.f5068a);
    }
}
