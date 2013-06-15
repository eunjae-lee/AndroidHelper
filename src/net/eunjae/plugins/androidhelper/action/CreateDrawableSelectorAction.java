package net.eunjae.plugins.androidhelper.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DataKeys;
import com.intellij.openapi.project.Project;
import net.eunjae.plugins.androidhelper.panel.InputDialog;

import java.awt.*;

// http://confluence.jetbrains.com/display/IDEADEV/PluginDevelopment
// http://confluence.jetbrains.com/display/IDEADEV/Plugin+Development+FAQ
public class CreateDrawableSelectorAction extends AnAction {
    public void actionPerformed(AnActionEvent e) {
        Project project = DataKeys.PROJECT.getData(e.getDataContext());

        InputDialog inputDialog = new InputDialog(project);
        inputDialog.setTitle("Input your drawable selector name:");
        inputDialog.setMinimumSize(new Dimension(350, 220));
        inputDialog.setVisible(true);
    }
}
