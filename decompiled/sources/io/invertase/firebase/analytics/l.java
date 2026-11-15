package io.invertase.firebase.analytics;

import com.facebook.react.N;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class l implements N {
    @Override // com.facebook.react.N
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ReactNativeFirebaseAnalyticsModule(reactApplicationContext));
        return arrayList;
    }

    @Override // com.facebook.react.N
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.EMPTY_LIST;
    }
}
