package io.invertase.firebase.app;

import Z6.h;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;
import p057f6.C6982c;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class ReactNativeFirebaseAppRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C6982c> getComponents() {
        return Collections.singletonList(h.b("react-native-firebase", c.f45180a));
    }
}
