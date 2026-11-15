package p036d5;

import android.os.Bundle;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;

/* JADX INFO: loaded from: classes2.dex */
final class C extends A {
    C(int i10, int i11, Bundle bundle) {
        super(i10, i11, bundle);
    }

    @Override // p036d5.A
    final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(JsonStorageKeyNames.DATA_KEY);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    @Override // p036d5.A
    final boolean b() {
        return false;
    }
}
