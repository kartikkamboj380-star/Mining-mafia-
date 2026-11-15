package p130n;

import O.AbstractC0842b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class c extends p130n.b implements MenuItem {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final H.b f46521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Method f46522e;

    private class a extends AbstractC0842b implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private AbstractC0842b.InterfaceC0066b f46523d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ActionProvider f46524e;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f46524e = actionProvider;
        }

        @Override // O.AbstractC0842b
        public boolean a() {
            return this.f46524e.hasSubMenu();
        }

        @Override // O.AbstractC0842b
        public boolean b() {
            return this.f46524e.isVisible();
        }

        @Override // O.AbstractC0842b
        public View c(MenuItem menuItem) {
            return this.f46524e.onCreateActionView(menuItem);
        }

        @Override // O.AbstractC0842b
        public boolean d() {
            return this.f46524e.onPerformDefaultAction();
        }

        @Override // O.AbstractC0842b
        public void e(SubMenu subMenu) {
            this.f46524e.onPrepareSubMenu(c.this.d(subMenu));
        }

        @Override // O.AbstractC0842b
        public boolean f() {
            return this.f46524e.overridesItemVisibility();
        }

        @Override // O.AbstractC0842b
        public void i(AbstractC0842b.InterfaceC0066b interfaceC0066b) {
            this.f46523d = interfaceC0066b;
            this.f46524e.setVisibilityListener(interfaceC0066b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z9) {
            AbstractC0842b.InterfaceC0066b interfaceC0066b = this.f46523d;
            if (interfaceC0066b != null) {
                interfaceC0066b.onActionProviderVisibilityChanged(z9);
            }
        }
    }

    static class b extends FrameLayout implements p120m.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final CollapsibleActionView f46526a;

        /* JADX WARN: Multi-variable type inference failed */
        b(View view) {
            super(view.getContext());
            this.f46526a = (CollapsibleActionView) view;
            addView(view);
        }

        View a() {
            return (View) this.f46526a;
        }

        @Override // p120m.c
        public void onActionViewCollapsed() {
            this.f46526a.onActionViewCollapsed();
        }

        @Override // p120m.c
        public void onActionViewExpanded() {
            this.f46526a.onActionViewExpanded();
        }
    }

    /* JADX INFO: renamed from: n.c$c, reason: collision with other inner class name */
    private class MenuItemOnActionExpandListenerC0477c implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f46527a;

        MenuItemOnActionExpandListenerC0477c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f46527a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f46527a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f46527a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    private class d implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f46529a;

        d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f46529a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f46529a.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, H.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f46521d = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f46521d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f46521d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC0842b abstractC0842bA = this.f46521d.a();
        if (abstractC0842bA instanceof a) {
            return ((a) abstractC0842bA).f46524e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f46521d.getActionView();
        return actionView instanceof b ? ((b) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f46521d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f46521d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f46521d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f46521d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f46521d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f46521d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f46521d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f46521d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f46521d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f46521d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f46521d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f46521d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f46521d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f46521d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f46521d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f46521d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f46521d.getTooltipText();
    }

    public void h(boolean z9) {
        try {
            if (this.f46522e == null) {
                this.f46522e = this.f46521d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f46522e.invoke(this.f46521d, Boolean.valueOf(z9));
        } catch (Exception e10) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f46521d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f46521d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f46521d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f46521d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f46521d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f46521d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(this.f46518a, actionProvider);
        H.b bVar = this.f46521d;
        if (actionProvider == null) {
            aVar = null;
        }
        bVar.b(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        this.f46521d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f46521d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z9) {
        this.f46521d.setCheckable(z9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z9) {
        this.f46521d.setChecked(z9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f46521d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z9) {
        this.f46521d.setEnabled(z9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f46521d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f46521d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f46521d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f46521d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f46521d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f46521d.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC0477c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f46521d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f46521d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i10) {
        this.f46521d.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        this.f46521d.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f46521d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f46521d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f46521d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z9) {
        return this.f46521d.setVisible(z9);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f46521d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f46521d.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f46521d.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f46521d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f46521d.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i10) {
        this.f46521d.setActionView(i10);
        View actionView = this.f46521d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f46521d.setActionView(new b(actionView));
        }
        return this;
    }
}
