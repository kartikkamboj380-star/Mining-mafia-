package x9;

import com.facebook.react.N;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import sk.kedros.playintegrity.RNGooglePlayIntegrityModule;

/* JADX INFO: loaded from: classes3.dex */
public class a implements N {
    @Override // com.facebook.react.N
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RNGooglePlayIntegrityModule(reactApplicationContext));
    }

    @Override // com.facebook.react.N
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.EMPTY_LIST;
    }
}
