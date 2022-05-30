package postportletfromjson.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import org.osgi.service.component.annotations.Component;
import postportletfromjson.constants.PostPortletFromJsonPortletKeys;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author Ivan
 */
@Component(
        immediate = true,
        property = {
                "com.liferay.portlet.display-category=category.sample",
                "com.liferay.portlet.header-portlet-css=/css/main.css",
                "com.liferay.portlet.instanceable=true",
                "javax.portlet.display-name=PostPortletFromJson",
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.view-template=/view.jsp",
                "javax.portlet.name=" + PostPortletFromJsonPortletKeys.POSTPORTLETFROMJSON,
                "javax.portlet.resource-bundle=content.Language",
                "javax.portlet.security-role-ref=power-user,user"
        },
        service = Portlet.class
)
public class PostPortletFromJsonPortlet extends MVCPortlet {
    @Override
    public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
        String text = new String(Files.readAllBytes(Paths.get("C:\\Users\\Ivan\\IdeaProjects\\LiferayProjectWithJsonFile\\modules\\PostPortletFromJson\\src\\main\\resources\\post.json")), StandardCharsets.UTF_8);
        renderRequest.setAttribute("post", text);
        super.doView(renderRequest, renderResponse);
    }
}