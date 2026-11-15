package androidx.webkit;

import I0.b;
import J0.B;
import J0.r;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface ProfileStore {
    static ProfileStore getInstance() {
        if (B.f1859d0.c()) {
            return r.getInstance();
        }
        throw B.a();
    }

    boolean deleteProfile(String str);

    List<String> getAllProfileNames();

    b getOrCreateProfile(String str);

    b getProfile(String str);
}
