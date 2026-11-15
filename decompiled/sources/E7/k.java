package E7;

import com.facebook.react.N;
import com.facebook.react.bridge.ReactApplicationContext;
import com.reactnativesystemnavigationbar.SystemNavigationBarModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class k implements N {
    @Override // com.facebook.react.N
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SystemNavigationBarModule(reactApplicationContext));
        return arrayList;
    }

    @Override // com.facebook.react.N
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.EMPTY_LIST;
    }
}
