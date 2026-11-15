package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1kSDK implements AFi1lSDK {

    @NotNull
    private PluginInfo getMonetizationNetwork = new PluginInfo(Plugin.NATIVE, "6.18.0", null, 4, null);

    @Override // com.appsflyer.internal.AFi1lSDK
    public final void getRevenue(@NotNull PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, "");
        this.getMonetizationNetwork = pluginInfo;
    }

    @Override // com.appsflyer.internal.AFi1lSDK
    @NotNull
    public final Map<String, Object> getRevenue() {
        Map<String, Object> mapL = kotlin.collections.E.l(p129m8.q.a("platform", this.getMonetizationNetwork.getPlugin().getPluginName()), p129m8.q.a("version", this.getMonetizationNetwork.getVersion()));
        if (!this.getMonetizationNetwork.getAdditionalParams().isEmpty()) {
            mapL.put(HandleInvocationsFromAdViewer.KEY_EXTRAS, this.getMonetizationNetwork.getAdditionalParams());
        }
        return mapL;
    }
}
