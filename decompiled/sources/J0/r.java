package J0;

import androidx.webkit.ProfileStore;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class r implements ProfileStore {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ProfileStore f1913b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ProfileStoreBoundaryInterface f1914a;

    private r(ProfileStoreBoundaryInterface profileStoreBoundaryInterface) {
        this.f1914a = profileStoreBoundaryInterface;
    }

    public static ProfileStore getInstance() {
        if (f1913b == null) {
            f1913b = new r(C.d().getProfileStore());
        }
        return f1913b;
    }

    @Override // androidx.webkit.ProfileStore
    public boolean deleteProfile(String str) {
        if (B.f1859d0.c()) {
            return this.f1914a.deleteProfile(str);
        }
        throw B.a();
    }

    @Override // androidx.webkit.ProfileStore
    public List getAllProfileNames() {
        if (B.f1859d0.c()) {
            return this.f1914a.getAllProfileNames();
        }
        throw B.a();
    }

    @Override // androidx.webkit.ProfileStore
    public I0.b getOrCreateProfile(String str) {
        if (B.f1859d0.c()) {
            return new q((ProfileBoundaryInterface) t9.a.a(ProfileBoundaryInterface.class, this.f1914a.getOrCreateProfile(str)));
        }
        throw B.a();
    }

    @Override // androidx.webkit.ProfileStore
    public I0.b getProfile(String str) {
        if (!B.f1859d0.c()) {
            throw B.a();
        }
        InvocationHandler profile = this.f1914a.getProfile(str);
        if (profile != null) {
            return new q((ProfileBoundaryInterface) t9.a.a(ProfileBoundaryInterface.class, profile));
        }
        return null;
    }
}
