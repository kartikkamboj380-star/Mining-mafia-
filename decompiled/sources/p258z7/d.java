package p258z7;

import com.facebook.react.N;
import com.facebook.react.bridge.ReactApplicationContext;
import com.proyecto26.inappbrowser.RNInAppBrowserModule;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class d implements N {
    @Override // com.facebook.react.N
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RNInAppBrowserModule(reactApplicationContext));
    }

    @Override // com.facebook.react.N
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.EMPTY_LIST;
    }
}
