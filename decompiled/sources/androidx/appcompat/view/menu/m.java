package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class m extends e implements SubMenu {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private e f7742B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private g f7743C;

    public m(Context context, e eVar, g gVar) {
        super(context);
        this.f7742B = eVar;
        this.f7743C = gVar;
    }

    @Override // androidx.appcompat.view.menu.e
    public e F() {
        return this.f7742B.F();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean I() {
        return this.f7742B.I();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean J() {
        return this.f7742B.J();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean K() {
        return this.f7742B.K();
    }

    @Override // androidx.appcompat.view.menu.e
    public void W(e.a aVar) {
        this.f7742B.W(aVar);
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean f(g gVar) {
        return this.f7742B.f(gVar);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f7743C;
    }

    @Override // androidx.appcompat.view.menu.e
    boolean h(e eVar, MenuItem menuItem) {
        return super.h(eVar, menuItem) || this.f7742B.h(eVar, menuItem);
    }

    public Menu j0() {
        return this.f7742B;
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean m(g gVar) {
        return this.f7742B.m(gVar);
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public void setGroupDividerEnabled(boolean z9) {
        this.f7742B.setGroupDividerEnabled(z9);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.a0(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.d0(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.e0(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f7743C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public void setQwertyMode(boolean z9) {
        this.f7742B.setQwertyMode(z9);
    }

    @Override // androidx.appcompat.view.menu.e
    public String v() {
        g gVar = this.f7743C;
        int itemId = gVar != null ? gVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.v() + ":" + itemId;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i10) {
        return (SubMenu) super.Z(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i10) {
        return (SubMenu) super.c0(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i10) {
        this.f7743C.setIcon(i10);
        return this;
    }
}
