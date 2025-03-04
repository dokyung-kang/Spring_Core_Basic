package hello.core.member;

public class MemberServiceImpl implements MemberService {

//    private final MemberRepository memberRepository = new MemoryMemberRepository(); // 구현체까지 의존하는 문제 있음(DIP 위반)

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {   // 생성자 주입
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
